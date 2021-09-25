package com.home;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		double temp = sc.nextInt();
		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = sc.nextInt();
		sc.close();
		windchill(temp, speed);
	}

	static void windchill(double t, double s) {

		double w = 35.74 + 0.6215 * t + 0.4275 * t * Math.pow(s, 0.16) - 35.75 * Math.pow(s, 0.16);
		System.out.println("Thw wind chill index is : " + w);
	}


}
