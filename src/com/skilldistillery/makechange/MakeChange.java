package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double itemPrice = 0.00;
		double cashTender = 0.00;
		
		System.out.println("What is the price of your item?");
		itemPrice = kb.nextDouble();

		System.out.println("How much money did the customer give you?");
		cashTender = kb.nextDouble();
		
		custBalance(itemPrice, cashTender);
	
		kb.close();
	}	
	
		public static double custBalance(double price, double tender) {
		
			double custBalance = (tender - price);
			custBalance = (double)Math.round(custBalance * 100d) /100d;
			
			if (custBalance == 0) {
				printZeroBalance();
				
					
			}	else if (custBalance > 0){
					
					System.out.println("The customer's change is " + "$" + custBalance);
					exactChangeDue(custBalance);
					
			}	else {
					custBalance = (double)Math.round(custBalance * 100d) /100d;
					
					System.out.println("************************************");
					System.out.println("******* The customer did not *******");
					System.out.println("****  give you enough money ********");
					System.out.println("*********  Request additional  *****");
					System.out.println("*************** $"+ (custBalance * -1) + " **************");
					System.out.println("************************************");
					}
				return custBalance;
			}
		
			
		public static String printZeroBalance() {
			
			
			String zeroBalance = "**********************************************\n"
								+ "** The customer has given you exact change **\n"
								+ "************* Balance is zero ***************\n"
								+ "*********************************************\n";
			
			System.out.println(zeroBalance);
						return zeroBalance;
				}
		
			
		
		public static double exactChangeDue(double custBalance) {
			
			double count = 0.00;
			
		while ( count >= 0) {
			
			if (custBalance >= 10) { 
				int tenDollarBill = (int)(custBalance / 10);
				System.out.println(tenDollarBill + " ten dollar bill." );
				count = custBalance = custBalance % 10;
				custBalance = (double)Math.round(custBalance * 100d) /100d;
			
				
			} else if (custBalance >= 5) {
					int fiveDollarBill = (int) (custBalance / 5);
					System.out.println(fiveDollarBill + " five dollar bill." );
					count = custBalance = custBalance % 5;
					custBalance = (double)Math.round(custBalance * 100d) /100d;
			
			
			} else if (custBalance >= 1) {
					int oneDollarBill = (int) (custBalance / 1);
					System.out.println(oneDollarBill + " one dollar bill." );
					count = custBalance = custBalance % 1;
					custBalance = (double)Math.round(custBalance * 100d) /100d;
			
					
			}else if (custBalance >= 0.25)	{
					int quarterCoin = (int) (custBalance / .25);
					System.out.println(quarterCoin + " quarter." );
					count = custBalance = custBalance % 0.25;
					custBalance = (double)Math.round(custBalance * 100d) /100d;
		
					
			} else if (custBalance >= 0.10) {
					int dimeCoin = (int) (custBalance / .10);
					System.out.println((dimeCoin) + " dime." );
					count = custBalance = custBalance % 0.10;
					custBalance = (double)Math.round(custBalance * 100d) /100d;
			
					
			} else if (custBalance >= 0.05)	{
					int nickelCoin = (int) (custBalance / .05);
					System.out.println((nickelCoin) + " nickel." );
					count = custBalance = custBalance % 0.05;
					custBalance = (double)Math.round(custBalance * 100d) /100d;
		
					
			} else if (custBalance >= .01) { 
					int pennyCoin = (int) (custBalance / .01 + .007);
					System.out.println((pennyCoin) + " penny." );
					custBalance = (double)Math.round(custBalance * 100d) /100d;
					break;
					
				}
			}
			return count;
			}

}


