package studentDataRUCSE25;

import java.io.File;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) throws Exception {
		int counter = 0;
		System.out.println("Enter the roll number you want to find : ");
		Scanner scanFromUser = new Scanner(System.in);
		String rollFromUser = new String("");
		rollFromUser = scanFromUser.nextLine();
		
		
		File file = new File("F:\\RAJSHAHI\\RU CSE 25\\3Y1S\\CSE3121 - Database Management Systems\\Home Work\\HW-1\\studentDataRUCSE25\\src\\studentDataRUCSE25\\data.csv");
		Scanner scanFromFile = new Scanner(file);
		
		while(scanFromFile.hasNextLine())
		{
			String dataFromFile = new String("");
			dataFromFile = dataFromFile + (String) scanFromFile.nextLine();
			
			String rollFromFile = new String("");
			String nameFromFile = new String("");
			String phoneFromFile = new String("");
			
			int i = 0;
			while(dataFromFile.charAt(i) != ',')
			{
				rollFromFile += dataFromFile.charAt(i);
				i++;
			}
			i+=2;
			while(dataFromFile.charAt(i) != ',')
			{
				nameFromFile += dataFromFile.charAt(i);
				i++;
			}
			i+=2;
			while(i<dataFromFile.length())
			{
				phoneFromFile += dataFromFile.charAt(i);
				i++;
			}
			
			StringBuffer temp = new StringBuffer(rollFromFile);
			
			if(rollFromUser.contentEquals(temp) == true)
			{
				System.out.println("Roll : "+rollFromFile);
				System.out.println("Name : "+nameFromFile);
				System.out.println("Phone : "+phoneFromFile);
		
				System.out.println("Number of processed line : "+counter);
				break;
			}
			
			counter++;
		}
	}
}