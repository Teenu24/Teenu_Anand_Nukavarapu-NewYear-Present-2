package com.epam.app;

class Gelabi extends sweets{
	int price = 3;
	public int display() {
		return total;
	}
	public void calculate_w(int n) {
		total =  n*weight;
	}
	public void getWeight(int n) {
		weight=n;
	}
	public void calculate_c(int n) {
		total =  n*price;
	}
}
