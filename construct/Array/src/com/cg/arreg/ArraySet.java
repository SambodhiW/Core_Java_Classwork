package com.cg.arreg;

public class ArraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			float a[]= {1.2f,2.3f,3.4f,4.5f,5.6f};
			float sum=0;
			for(float i:a)
			{
				sum=sum+i;
			}
			System.out.println("the value of " +sum/a.length);
				}

	}


