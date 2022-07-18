package com.csmtech;

public class MyMathImpl implements MyMath {

	@Override
	public int add(int a, int b) {
		int r=a+b;
		return r;
	}

	@Override
	public int mul(int a, int n) {
		return a*n;
	}

}
