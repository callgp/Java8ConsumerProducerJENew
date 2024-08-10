package com.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class ClassB_JE {
	public static void main(String[] args) {
	Supplier<Date>	s1= ()->new Date();
	System.out.println(s1.get());
	System.out.println(s1.get());
	System.out.println(s1.get());
	}

}
