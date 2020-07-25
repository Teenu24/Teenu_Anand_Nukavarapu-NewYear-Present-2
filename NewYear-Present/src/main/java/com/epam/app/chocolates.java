package com.epam.app;

public class chocolates {
	int size;
	int price;
}

class DairyMilk extends chocolates{
	int dweight = 50;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_w(int n) {
		return dweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}

class Snickers extends chocolates{
	int sweight = 30;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_w(int n) {
		return sweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}