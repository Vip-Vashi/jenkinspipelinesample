package com.testing.JunitTask;

public class IncOrd {
public static boolean  IncreasingOrder(int n) {
	
	boolean flag=false;
	String str = "";
	str+=n;
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]>arr[i]) {
			flag=true;
		}
		else {
			flag=false;
			return flag;
		}
	}
	return flag;
	
	
}
}
