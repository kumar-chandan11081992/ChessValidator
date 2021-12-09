package driver;

import java.util.Scanner;

import facade.AppFacade;

public class Driver {

	public static void main(String[] args) {

		AppFacade facade = new AppFacade();
		facade.initializeBoard();
		facade.showBoard();
		

		while (true) {
			Scanner myObj = new Scanner(System.in);
			String userInput = myObj.nextLine();
			String[] srcDest = userInput.split(" ");
			String source = srcDest[0];
			String destination = srcDest[1];
			boolean vaild = facade.validateMove(source.charAt(0),source.charAt(1), destination.charAt(0), destination.charAt(1));
			facade.movePiece(source.charAt(0),source.charAt(1), destination.charAt(0), destination.charAt(1));
			facade.showBoard();
		}
	}

}
