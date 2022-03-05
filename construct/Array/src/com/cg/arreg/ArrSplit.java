package com.cg.arreg;
import java.util.Arrays;
public class ArrSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] IniArray= {58,24,13,15,63,9,8,81,1,78};
		 int n=IniArray.length;
		 int a[]=new int[(n+1)/2];
		 int b[]=new int[n-a.length];

		 for(int i=0;i<n;i++)
		 {
			 if(i<a.length)
			 {
				 a[i]=IniArray[i];
			 }else {
				 b[i-a.length]=IniArray[i];
			 }
		 }
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));

			}

	}


