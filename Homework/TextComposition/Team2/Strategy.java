import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

interface Strategy{
	public ArrayList<Line> arrange(ArrayList<Component> component_list);
}
