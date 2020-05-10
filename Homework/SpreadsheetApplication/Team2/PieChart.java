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

public class PieChart implements Pltstgy{
	public void print(LinkedHashMap<String, Data> data_list){
		int total = 0;

		for (Map.Entry<String, Data> me : data_list.entrySet()){

			total += me.getValue().value;
		}
		
		for (Map.Entry<String, Data> me : data_list.entrySet()){
			double tmp_percentage = me.getValue().value * 100.0 / total;

			BigDecimal percentage = new BigDecimal(tmp_percentage).setScale(1, RoundingMode.HALF_UP);

			System.out.print(me.getKey() + " ");
			System.out.println(percentage + "%");	
		}
	}


	public void modify(){}
}