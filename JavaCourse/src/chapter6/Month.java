package chapter6;

public class Month {

	public static String getMonth(int month) {
		switch(month) {
		case 1: return "January";
		case 2: return "Febuary";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "Sepember";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "Invalid month, enter between 1 and 12";
		}
	}
	public static int getMonth(String month) {
		switch(month) {
		case "January": return 1;
		case "Febuary": return 2;
		case "March": return 3;
		case "April": return 4;
		case "May": return 5;
		case "June": return 6;
		case "July": return 7;
		case "August": return 8;
		case "Sepember": return 9;
		case "October": return 10;
		case "November": return 11;
		case "December": return 12;
		default: return -1;
		}
	}
	
}
