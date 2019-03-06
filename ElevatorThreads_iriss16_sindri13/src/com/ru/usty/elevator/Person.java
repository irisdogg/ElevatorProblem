package com.ru.usty.elevator;

//Implements Runnable so a thread will run this class
public class Person implements Runnable {

	private int sourceFloor;
	private int destinationFloor;
	private int personsElvatorID; //persóna fer í þá lyftu sem laus er. Para þarf ID við þá lyftu og auðkenni sem hún ber þegar lyfta er laus.

	int sourceFloor, destination;
	Person(int sourceFloor, int destination) {
		this.sourceFloor = sourceFloor;
		this.destination = destinationFloor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		
		
		try {
			ElevatorScene.sem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Person Thread");
		
	}

}
