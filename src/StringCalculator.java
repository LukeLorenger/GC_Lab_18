import java.util.ArrayList;

//imput(number) //result
//					"0"
//	7				"7"
//	2, 3			"5"
//	1, 100			101"


public class StringCalculator {

	public static String add(String number) {
		if(number.contains(",") && number.contains(".")) {
			String[] values = number.split(",");
			String value1 = values[0];
			String value2 = values[1];
			double x = Double.parseDouble(values[0]);
			double y = Double.parseDouble(values[1]);
			double z = x + y;
			return Double.toString(z);
		}
		if(number.contains(",")) {
			String[] values = number.split(",");
			String value1 = values[0];
			String value2 = values[1];
			int x = Integer.parseInt(values[0]);
			int y = Integer.parseInt(values[1]);
			int z = x + y;
			return Integer.toString(z);
		}
		

		if( number == "") {
			return "0";
		}else if (number == "0") {
			return null;
		}
		return number;
	}

}
