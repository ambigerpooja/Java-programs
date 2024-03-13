package Collection.learn.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Collection4 {

	public static void main(String[] args) 
	{
		//Creating the object of ArrayDeque calss
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(20);
		ad.add(60);
		System.out.println("ad--->"+ad);//ad--->[10, 30, 40, 50, 20, 60]
		//Converting ArrayDeque calss to ArrayList class
		ArrayList al=new ArrayList();
		al.addAll(ad);
		Collections.sort(al);
		ad.clear();
		System.out.println("al--->"+al);
		
		ad.addAll(al);
		System.out.println("al--->"+al);		

	}

}
//output
//ad--->[10, 30, 40, 50, 20, 60]
//al--->[10, 20, 30, 40, 50, 60]
//al--->[10, 20, 30, 40, 50, 60]
