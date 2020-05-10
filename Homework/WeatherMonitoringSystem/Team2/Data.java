import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.StringBuilder;

public class Data
{
	public LinkedHashMap<String, Display> DisplayList;
	public ArrayList<Double> TemperatureList;
	public ArrayList<Double> HumidityList;
	public ArrayList<Double> PressureList;

	public Data(){
		this.DisplayList = new LinkedHashMap<String, Display>();
		this.TemperatureList = new ArrayList<Double>();
		this.HumidityList = new ArrayList<Double>();
		this.PressureList = new ArrayList<Double>();

	}

	public void attach(Display displayType){
		String DisplayName = displayType.getClass().getName();
		this.DisplayList.put(DisplayName , displayType);
	}

	public void detach(Display displayType){
		String DisplayName = displayType.getClass().getName();
		this.DisplayList.remove(DisplayName);
	}

	public void setData(Double temperature, Double humidity, Double pressure){
		TemperatureList.add(temperature);
		HumidityList.add(humidity);
		PressureList.add(pressure);
		notifyDisplay();
	}

	public void notifyDisplay(){
		for (Map.Entry<String, Display> me : this.DisplayList.entrySet()){
			me.getValue().update(this);
		}
	}

	public ArrayList<Double> getTemperature(){
		return this.TemperatureList;
	}

	public ArrayList<Double> getHumidity(){
		return this.HumidityList;
	}

	public ArrayList<Double> getPressure(){
		return this.PressureList;
	}

}






