package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
	   public static void main(String args[]) {
	   // create an array of string objs
	   String initList[] = { "One", "Two", "Four", "One",};

	   // create one list
	   List<String> list = new ArrayList<String>();
	   list.add("One");
	   list.add("Two");
	   list.add("Four");
	   list.add("One");

	   System.out.println("List value before: "+list);

	   // create singleton list
	   list = Collections.singletonList("	WWWWWWWWW");
	   for (String string : list) {
		   System.out.println(string);
	   }


	   }
	//Use it when  code expects a read-only list, but you only want to pass one element in it. singletonList() is (thread-)safe and fast.
	}
