package com.computer;

public class Computer_V1 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("IT WORKS");
			return ;
		}
		if (args.length == 1) {
			Variable test = new Variable(2, -3);
			System.out.println(test);
			return ;
		}
	}
}
