package view;

import java.util.Scanner;

public class AppView {
	
	Scanner reader;
	
	public AppView() {
		reader = new Scanner(System.in);
	}

	public void writeChoice(int choice) {
		System.out.print("Algorithm choosed to ");
		switch(choice) {
		case 1:
			System.out.println("cooperate (1).");
			break;
		case 2:
			System.out.println("betray (2).");
			break;
		case 3:
			System.out.println("want more (3).");
			break;
		}
	}
	
	public Integer readEnemyChoice() {
		System.out.println("Enemy's choice: ");
		return reader.nextInt();
	}
	
	public Integer readTurnsNumber() {
		System.out.println("Type in number of turns: ");
		return reader.nextInt();
	}
}
