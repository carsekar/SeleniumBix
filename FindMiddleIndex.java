package com.JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindMiddleIndex {
	
	public static int findMiddleIndexMethod(int[] intArray){

		int sumArray = 0;

		int leftSumArray=0;

		for (int i=0; i<intArray.length;i++){

		sumArray+=intArray[i];

		}

		 for (int j=0; j<intArray.length; j++){

		sumArray=sumArray-intArray[j];
		System.out.println("The sum array"+sumArray);

		 if (leftSumArray==sumArray){

		return j;

		}

		leftSumArray+=intArray[j];
		System.out.println("The left sum array"+leftSumArray);

		}

		return -1;

		}

		public static void main(String[] args) {

		//int[] ia = {1, 5, 8, 7, 8, 1, 5};
		 int [] ia={ 2, 4, 4, 5, 4, 1 };
		 Set<Integer> hashSet=new HashSet<Integer>();
		 for(int a:ia)
		 {
			 if(hashSet.add(a)==false)
			 {
				 System.out.println("Return false"+a);
			 }
		 }
		 

		/*int mi = findMiddleIndexMethod(ia);

		System.out.print("Middle index of the array when both ends sums equal"+ia[mi]);*/

		 }


}
