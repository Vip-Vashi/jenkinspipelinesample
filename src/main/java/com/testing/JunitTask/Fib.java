package com.testing.junittask;

public class Fib {
	
	
private Fib() {
		super();
		// TODO Auto-generated constructor stub
	}

public static int fibo(int n) {
	int a =0;
	int b=1;
	int result=0;
	for(int i = 2; i<n;i++) {
		result=a+b;
		a=b;
		b=result;
	}
	return result;
}
}
