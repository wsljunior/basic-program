package application;

import java.util.Locale;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int integerValue = 2020;
		double doubleValue = 2020.666666;
		System.out.println("******* JAVA - Basic Program *******");
		System.out.println(integerValue);
		System.out.println(doubleValue);
		System.out.printf("%.2f%n",doubleValue);
		System.out.println("Integer Value: "+ integerValue + ". Double Value: "+ doubleValue);
	}

}
