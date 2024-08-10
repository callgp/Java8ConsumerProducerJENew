package com.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class ClassD {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			String otp="OD-";
			for(int i=0;i<6;i++) {
				otp=otp+new Random().nextInt(10);
			}
			return otp;
			};
			System.out.println(s.get());
		}

	}


