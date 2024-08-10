package com.java8.supplier;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"java");
		map.put(2,"pp");
		map.put(3,"java");
		map.put(4,"aa");
		map.put(5,"eee");

		System.out.println(map);
		//al.forEach(s -> System.out.println(s));
		//al.forEach(System.out::println);
		map.forEach((k,v)->System.out.println(k+" "+v));;
	}

}
