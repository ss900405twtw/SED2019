import java.io.*;
import java.util.ArrayList;
public class StatisticsDisplay implements Display
{
	public void update(Data data)
	{
		System.out.print("Temperature ");
		printArray(data.TemperatureList);

		System.out.print("Humidity ");
		printArray(data.HumidityList);

		System.out.print("Pressure ");
		printArray(data.PressureList);
	}

	private void printArray(ArrayList<Double> arr)
	{
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.print(String.format("%.1f", arr.get(i)));
			if (i != arr.size() - 1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}

}
