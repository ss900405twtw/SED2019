import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        USWeatherData usdata = new USWeatherData();
        AsiaWeatherData asiadata = new AsiaWeatherData();

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = reader.readLine();

        while (line != null) {
            String[] lineArgs = line.split(" ");
            String area = lineArgs[1];
            if (lineArgs[0].equals("data")) {

                if(area.equals("US")){
                    usdata.setData(Double.parseDouble(lineArgs[2]), Double.parseDouble(lineArgs[3]), Double.parseDouble(lineArgs[4]));
                }
                else if(area.equals("Asia")){
                    asiadata.setData(Double.parseDouble(lineArgs[2]), Double.parseDouble(lineArgs[3]), Double.parseDouble(lineArgs[4]));
                }

            } else if (lineArgs[0].equals("attach")) {
                String newdisplay =  lineArgs[2];

                if(area.equals("US") && newdisplay.equals("Current")){
                    usdata.attach(new CurrentConditionsDisplay());
                }
                else if(area.equals("Asia") && newdisplay.equals("Current")){
                    asiadata.attach(new CurrentConditionsDisplay());
                }
                else if(area.equals("US") && newdisplay.equals("Statistics")){
                    usdata.attach(new StatisticsDisplay());
                }
                else if(area.equals("Asia") && newdisplay.equals("Statistics")){
                    asiadata.attach(new StatisticsDisplay());
                }
                else if(area.equals("US") && newdisplay.equals("Forecast")){
                    usdata.attach(new ForecastDisplay());
                }
                else if(area.equals("Asia") && newdisplay.equals("Forecast")){
                    asiadata.attach(new ForecastDisplay());
                }

            } else if (lineArgs[0].equals("detach")) {
                String newdisplay =  lineArgs[2];

                if(area.equals("US") && newdisplay.equals("Current")){
                    usdata.detach(new CurrentConditionsDisplay());
                }
                else if(area.equals("Asia") && newdisplay.equals("Current")){
                    asiadata.detach(new CurrentConditionsDisplay());
                }
                else if(area.equals("US") && newdisplay.equals("Statistics")){
                    usdata.detach(new StatisticsDisplay());
                }
                else if(area.equals("Asia") && newdisplay.equals("Statistics")){
                    asiadata.detach(new StatisticsDisplay());
                }
                else if(area.equals("US") && newdisplay.equals("Forecast")){
                    usdata.detach(new ForecastDisplay());
                }
                else if(area.equals("Asia") && newdisplay.equals("Forecast")){
                    asiadata.detach(new ForecastDisplay());
                }
            }

            line = reader.readLine();
        }
    }
}
