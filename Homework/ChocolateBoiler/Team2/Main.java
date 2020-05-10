import java.io.*;
import java.util.Arrays;
import java.util.*;
public class Main {
  public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(args[0]));
			String line = reader.readLine();
			Boiler boiler = Boiler.getBoiler();
			while (line != null) {
				if(line != null)
				{
					// System.out.println(line);
					
					String[] array = line.split(" ", -1);
					if(array[0].equals("Fill"))
					{
						boiler.getBoiler().fill();
					}
					else if(array[0].equals("Drain"))
					{
						boiler.getBoiler().drain();
					}
					else if(array[0].equals("Boil"))
					{

						boiler.getBoiler().boil();

					}

				}
				line = reader.readLine();

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
