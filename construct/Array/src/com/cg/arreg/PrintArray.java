package com.cg.arreg;
import java.util.Arrays;
public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String name[]= {"red","green","blue"};
			//System.out.println(name);
			//for(int i=0;i<name.length;i++)
			//{
				//System.out.println(name[i]);
			//}
			for(String i:name)
			{
				System.out.println(i);
			}
			System.out.println(Arrays.asList(name));
			System.out.println("By using to String methord"+Arrays.toString(name));
	        Arrays.asList(name).stream().forEach(s->System.out.println("Using Stream"+s));
		}
	}


