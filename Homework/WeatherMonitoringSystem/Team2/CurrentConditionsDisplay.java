import java.io.*;
public class CurrentConditionsDisplay implements Display
{
	public void update(Data data)
	{
		System.out.println("Temperature "+ String.format("%.1f", data.getTemperature().get(data.getTemperature().size()-1)));
		System.out.println("Humidity "+ String.format("%.1f", data.getHumidity().get(data.getHumidity().size()-1)));
		System.out.println("Pressure "+ String.format("%.1f", data.getPressure().get(data.getPressure().size()-1)));
	}

}
