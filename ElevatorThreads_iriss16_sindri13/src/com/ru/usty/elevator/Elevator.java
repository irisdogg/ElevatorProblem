package com.ru.usty.elevator;

public class Elevator implements Runnable {

	public int currentFloor = 0;
	public int elevatorID;

	public Elevator(int numberOfElevators){
		this.elevatorID = numberOfElevators;
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
