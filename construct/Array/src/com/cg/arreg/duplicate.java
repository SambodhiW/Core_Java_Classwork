package com.cg.arreg;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,2,3,4,54,3,2,1};
		for (int i=1;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j])
				{
					System.out.println("the duplicate value is "+a[i]);
				}
			}
		}
			}

	}


