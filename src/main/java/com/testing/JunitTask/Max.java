package com.testing.junittask;

public class Max {
	
	
private Max() {
		super();
		// TODO Auto-generated constructor stub
	}

public static int maxOfDigits(int n) {
	int max=0;
	
	while(n!=0) {
		
		if(n%10 > max) 
		{
			max=n%10;
		}
		n=n/10;
	}
	
	
	
	
	return max;
}
}
