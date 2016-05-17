package com.Karayvansky.Homework14;

public abstract class Player {

	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private char type;

	public Player(String firstName, String lastName, String middleName, int age, char type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.type = type;

	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public abstract String makeMove();
}
