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

	int elevatorLimitOfCapacityLeft - getNumberOfPeopleInElevator(this.elevatorID);

	private void enterSelectedFloor{
		for(int i = 0; i < elevatorLimitOfCapacityLeft; i++){
			ElevatorScene.exitedCountMutex.release();
		}
	}

	private void enterSelectedElevator{
		if(getNumberOfPeopleInElevator() > 6)
		for(int i = 0; i < elevatorLimitOfCapacityLeft(); i++){
			ElevatorScene.enterElevator.acquire();
		}
	}

	public void elevatorAscending(){
		currentFloor++;
	}

	public void elevatorDescending(){
		currentFloor--;
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
