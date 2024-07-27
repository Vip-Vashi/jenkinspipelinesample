package com.testing.JunitTask;

public class Max {
public static int MaxOfDigits(int n) {
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
