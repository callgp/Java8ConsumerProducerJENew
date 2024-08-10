package com.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class ClassD3 {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			String otp="abc";
			for(int i=0;i<6;i++) {
				otp=otp+new Random().nextInt(10);
			}
			return otp;
			};
			System.out.println(Integer.parseInt(s.get()));
		}

	}


