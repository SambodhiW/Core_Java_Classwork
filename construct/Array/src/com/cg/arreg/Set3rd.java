package com.cg.arreg;

public class Set3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat1= { {1,2,3},
				{4,5,6}	};
				int [][] mat2= { {1,2,3},
				{3,4,5} };

				int [][] result = {{0,0,0},
				{0,0,0}};
				for(int i=0;i<mat1.length;i++) {//row number of times
					for(int j=0;j<mat1[i].length;j++)//column number of times
					{
						result[i][j]=mat1[i][j]+mat2[i][j];
					}
				}

				}
	}


