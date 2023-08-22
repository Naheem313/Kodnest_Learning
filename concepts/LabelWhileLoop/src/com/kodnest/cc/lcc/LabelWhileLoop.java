package com.kodnest.cc.lcc;

public class LabelWhileLoop {

	public static void main(String[] args) {
				int i =1;
			rajni:while(i<=5)
				{
					int j=1;
				tamanna:while(j<=5)
					{
						System.out.println("* ");
						j++;
						break rajni;
					}
					System.out.println();
					i++;
				}
	}

}
