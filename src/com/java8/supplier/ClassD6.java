package com.java8.supplier;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClassD6 {

	public static void main(String[] args) {
		Consumer<String> c= s-> System.out.println(s);
		c.accept("je");
		c.accept("xx");
		c.accept("56");
		
		}

	}


