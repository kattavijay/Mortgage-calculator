package com.javamix.mortgage.interest;

public class InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double base =  200000;		
		double irate = 3.8750;
		double mPayment = 1010;
		double extraPayment=0;
		double totalINterest = 0;
		int i = 1;
		
		while(base>0)
		{
		double mInterest = ((base*irate)/100)/12;	
		totalINterest = totalINterest + mInterest;
		double mBasepayment = (mPayment+extraPayment) - mInterest;
		base = base - mBasepayment;		
		
		System.out.println("------"+i+"------------");
		System.out.println("Interest = "+mInterest);
		System.out.println("Principle = "+mBasepayment);
		System.out.println("Balance Principle = "+base);
		
		i++;
		}
		
		System.out.println("*******************************************************************************************");
		System.out.println("************* No of months to pay ="+i);
		System.out.println("If you pay "+mPayment+"  per month, Loan will be closed in "+i/12+" Years by "+(2017+(i/12)));
		System.out.println("Total interest paid to close the loan = "+totalINterest);
		System.out.println("*******************************************************************************************");
	}
	

}
