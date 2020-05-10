import java.io.*;
public class ForecastDisplay implements Display
{
	public void update(Data data)
	{
		double humd = data.getHumidity().get(data.getHumidity().size()-1);
		if(humd > 0.8)
		{
			System.out.println("Forecast rain.");
		}
		else if(humd < 0.2)
		{
			System.out.println("Forecast sunny.");
		}
		else
		{
			System.out.println("Forecast cloudy.");
		}
	}
}