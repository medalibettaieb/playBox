package junit.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateChosen = "2015-02-24";
		date = (Date) format.parse(dateChosen);
		System.out.println(format.format(date));

	}

}
