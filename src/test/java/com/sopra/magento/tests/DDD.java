package com.sopra.magento.tests;

public class DDD {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int sum;
		
		System.out.print(i+","+j+",");
		
		for (int k=2;k<10;k++) {
			
			sum=i+j;
			System.out.print(sum+",");
			i=j;
			j=sum;
		}

	}

}
