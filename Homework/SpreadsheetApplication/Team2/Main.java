import java.io.*;
import java.util.Arrays;
import java.util.*;
public class Main {
  public static void main(String[] args) {
	    Presentation pre = new Presentation(); 
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(args[0]));
			String line = reader.readLine();
			while (line != null) {
				// if(line != null)
				// {
				// System.out.println(line);

				String[] array = line.split(" ", -1);
				if(array[0].equals("data"))
				{
					pre.add(array[1],Integer.valueOf(array[2]));
				}
				else if(array[0].equals("addChart"))
				{
					if(array[1].equals("Spreadsheet"))
					{
						pre.add_strategy(new Spreadsheet());
					}
					else if(array[1].equals("BarChart"))
					{
						pre.add_strategy(new BarChart());
					}
					else
					{
						pre.add_strategy(new PieChart());
					}
				}
				else if(array[0].equals("change"))
				{
					System.out.println(array[1] + " change " + array[2] + " "+ array[3] + ".");
					if(array[1].equals("Spreadsheet"))
					{
						pre.change(new Spreadsheet(), array[2],Integer.valueOf(array[3]));
					}
					else if(array[1].equals("BarChart"))
					{
						pre.change(new BarChart(), array[2],Integer.valueOf(array[3]));
					}
					else
					{
						pre.change(new PieChart(), array[2],Integer.valueOf(array[3]));
					}

				}
				//}
				line = reader.readLine();

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
