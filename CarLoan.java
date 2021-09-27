package com.home;

public class CarLoan
{
	public static void main(String[] args)
	{
		System.out.println("CMD Arguments");
		double principle=Double.parseDouble(args[0]);
		double rate_of_intrest=Double.parseDouble(args[1]);
		int year=Integer.parseInt(args[2]);
		System.out.println("the given principle amount is:"+principle+"\n"+" The rate of intrest is:"
				+rate_of_intrest + "\n"+"The number of years is:"+year);
		double rate=rate_of_intrest/(12*100);
		int n=(12*year);
		System.out.println("the car loan payment is:");
		double payment=(principle*rate)/1-(Math.pow(1+rate, -n));
		System.out.println(payment);
	}

}
