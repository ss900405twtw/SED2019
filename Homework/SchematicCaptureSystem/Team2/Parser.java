import java.util.Stack;
import java.util.ArrayList;

public class Parser {
    private String content;
    int currentPos = 0;

    Parser(String content) {
        this.content = content;
    }


    // Return a list of top-level elements.
    ArrayList<Element> parse() {
        this.currentPos = 0;
        
        ArrayList<Element> topLevelElements = new ArrayList<Element>();

        Stack<Element> ancestors = new Stack<Element>();

        while (hasNextElement(this.currentPos)) {
            Element element = nextElement();

            if (element == null) {
                ancestors.pop();

            } else {
                if (ancestors.empty()) {
                    topLevelElements.add(element);
                } else {
                    Group parent = (Group) ancestors.peek();
                    parent.addElement(element); 
                }


                if (! element.isLeaf()) {
                    ancestors.push(element);
                }

            }

            this.currentPos = findTagEndPos(this.currentPos);
        }

        return topLevelElements;
    }

    private boolean hasNextElement(int pos) {
        return findNextTagStart(pos) != -1;
    }

    private Element nextElement() {
        // returns next element,
        // if a element is closed, return null.

        this.currentPos = findNextTagStart(this.currentPos);
        while (isCommentTag(this.currentPos)) {
            // comment tag, skip and move on.
            this.currentPos = findTagEndPos(this.currentPos+1);
            this.currentPos = findNextTagStart(this.currentPos);
            if (this.currentPos == -1) {
                return null;
            }
        }

        if (isCloseTag(this.currentPos)) {
            return null;
        }

        int tagEndPos = findTagEndPos(this.currentPos);
        boolean isLeaf = isLeafTag(this.currentPos);
        String tagName;
        if (isLeaf) {
            tagName = content.substring(this.currentPos+1, tagEndPos-1);
        } else {
            tagName = content.substring(this.currentPos+1, tagEndPos);
        }
        // System.out.println("#" + tagName + "#");
        
        if (tagName.equals("Line")) {
            return new Line(isLeaf);
        } else if (tagName.equals("Question")){
            return new Question(isLeaf);
        } else if (tagName.equals("Rectangle")) {
            return new Rectangle(isLeaf);
        } else if (tagName.equals("Group")) {
            return new Group(isLeaf);
        } else if (tagName.equals("Text")) {
            return new Text(isLeaf);
        } else {
            System.out.println("Unknown Element!!!");
            return new Group(true);
        }

    }

    private int findNextTagStart(int fromPos) {
        // returns -1 if there's no next tag
        return this.content.indexOf('<', fromPos);
    } 

    private boolean isCommentTag(int tagStartPos) {
        return content.charAt(tagStartPos+1) == '?';
    }

    private boolean isCloseTag(int tagStartPos) {
        return content.charAt(tagStartPos+1) == '/';
    }

    private boolean isLeafTag(int tagStartPos) {
        int tagEndPos = findTagEndPos(tagStartPos);
        return content.charAt(tagEndPos-1) == '/';
    }


    private int findTagEndPos(int tagStartPos) {
        return content.indexOf('>', tagStartPos);
    }

}