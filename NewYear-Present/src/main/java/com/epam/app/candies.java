package com.epam.app;

public class candies extends App{
	int quantity;
	static int range=50;
}

class Jelly extends candies{
	int jweight = 2;
	int price = 2;
	public int display() {
		return quantity;
	}
	public void quantity(int n) {
		quantity=n;
	}
	public int cal_w(int n) {
		return jweight*n;
	}
	public int cal_p(int n) {
		return price*n;
	}
}

class Lollipop extends candies{
	int lweight = 10;
	int price = 5;
	public int display() {
		return quantity;
	}
	public void quantity(int n) {
		quantity=n;	
	}
	public int cal_w(int n) {
		return lweight*n;
	}
	public int cal_p(int n) {
		return price*n;
	}
}
