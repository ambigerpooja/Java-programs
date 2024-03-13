package Collection.learn.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections3 {

	public static void main(String[] args)
	{
		//Create an object of Arraylist
		ArrayList<Float> al=new ArrayList<Float>();
		al.add(85.36F);
		al.add(23.56F);
		al.add(23.23F);
		al.add(88.26f);
		al.add(56.45F);
		System.out.println(al);
      
		
		
		//create the object of Linkedlist
		LinkedList<Boolean> ll=new LinkedList<Boolean>();
		ll.add(true);
		ll.add(false);
		ll.add(true);
		ll.add(false);
		ll.add(true);
		System.out.println(ll);
		
		//Create an object of ArrayDeque
		ArrayDeque<Character> ad=new ArrayDeque<Character>();
		ad.add('A');
		ad.add('P');
		ad.add('M');
		ad.add('N');
		ad.add('R');
		System.out.println(ad);
		
	}

}
