package com.testing.junittask;


public class App 
{
	
    private App() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int sumOfdigits(int n )
    { 
    	int sum=0;
        while(n!=0) {
        	sum+= n%10;
        	n=n/10;
        }
      
    
    
        return sum;
    }
}
