package com.ru.usty.elevator;

//Implements Runnable so a thread will run this class
public class Person implements Runnable {

	int sourceFloor, destination;
	Person(int sourceFloor, int destination) {
		this.sourceFloor = sourceFloor;
		this.destination = destination;
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
