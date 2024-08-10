package com.java8.supplier;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("java");
al.add("pp");
al.add("java");
al.add("aa");
al.add("eee");

System.out.println(al);
al.forEach(s->System.out.println(s));
al.forEach(System.out::println);
	}

}
