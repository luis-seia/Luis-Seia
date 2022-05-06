package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.crypto.Data;

public class Datas {
	public static void main (String[] args) throws ParseException {
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	date3.setTimeZone(TimeZone.getTimeZone("GMT"));
	
	Date data1 = date.parse("25/06/2022");
	Date data2 = date.parse("25/06/2022 12:42:01");
	Date data3 = new Date();
	Date data4 =  Date.from(Instant.parse("2022-05-21T15:42:07Z"));
	System.out.println(data1);
	System.out.println(date3.format(data2));
	System.out.println(date3.format(data3));
	System.out.println(date3.format(data4));
	
	}
}
