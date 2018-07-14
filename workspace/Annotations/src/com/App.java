package com;

public class App {

	public static void main(String[] args) {
		Container container = new Container();
		container.handle("/register", "asf", "1233");
		container.handle("/login", "asf", "1233");

	}

}
