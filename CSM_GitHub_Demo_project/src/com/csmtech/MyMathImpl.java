package com.csmtech;

public class MyMathImpl implements MyMath {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int mul(int a, int n) {
		return a*n;
	}

}
