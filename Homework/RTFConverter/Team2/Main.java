import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String inputfile = args[0];
        String textFormat, textContent;
        TextFormat convertedFormat = new TextFormat();
        FileReader fr = new FileReader(inputfile);
        BufferedReader br = new BufferedReader(fr);

        RTFConverter rtfConverter = new RTFConverter();
        TeXConverter tc = new TeXConverter();
        WidgetConverter wc = new WidgetConverter();

        tc.convertMap.put('C', new TexCConvertToken());
        tc.convertMap.put('F', new TexFConvertToken());
        tc.convertMap.put('P', new TexPConvertToken());

        wc.convertMap.put('C', new WidgetCConvertToken());
        wc.convertMap.put('F', new WidgetFConvertToken());
        wc.convertMap.put('P', new WidgetPConvertToken());

        while (br.ready())
        {
            textFormat = br.readLine();
            textContent = br.readLine();
            
            if (textFormat.equals("TeX"))
            {
                convertedFormat = rtfConverter.convert(tc, textContent);
            }
            else if (textFormat.equals("TextWidget"))
            {
                convertedFormat = rtfConverter.convert(wc, textContent);
            }

            convertedFormat.display();
        }
    }
}