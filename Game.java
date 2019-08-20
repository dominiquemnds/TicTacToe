import java.util.Scanner;
import java.util.*;
public class Game {
//Simple Tic Tac Toe game bc I'm bored
	
	public static void main (String args[]) throws InterruptedException{
		
		Scanner lis = new Scanner(System.in);
		
		System.out.println("Welcome to the Tic Tac Toe Game!");
		System.out.println("*********************************");
		Thread.sleep(2000);
		System.out.println("Simply choose the number space you'd like to choose to play.");
		System.out.println("**************************************************************");
		Thread.sleep(2000);
		System.out.println("Player one, What is your name?");
		String Player1Name = lis.nextLine();
		System.out.println("*********************************");
		System.out.println("Player two, What is your name?");
		System.out.println("**********************************");
		String Player2Name = lis.nextLine();
		System.out.println("Welcome, "+Player1Name+" and "+Player2Name+". Let's play!\n");
		Thread.sleep(2000);
		
		
		String[][] Gameboard = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		prettyPrint(Gameboard);
		
		int turns=0;
		int player=1;
		while (turns<9) {
		Gameboard= takeATurn(Gameboard, Player1Name, Player2Name, player);
		prettyPrint(Gameboard);
		turns=CheckforWinner(Gameboard, Player1Name, Player2Name, turns);
		player=player+1;
		turns=turns+1;
		}
		if(turns==9||turns==10) {
			System.out.println("\nAwww, a tie?? Play again!");
		}
	}
	
	public static void prettyPrint(String[][] gameboard) {
		int i =0;
		int j =0;
		while (j<3) {
		i =0;	
		
		for ( i=0; i<3; i++){
			System.out.print(" * "+gameboard[j][i]);
			
			if(i==2) {
				System.out.print(" *");
			}
		}
		
		if (j==0 ||j==1) {
		System.out.println("\n**************");
		}
		
		j=j+1;
		}
		
	}
	
	public static String[][] takeATurn(String[][] gameboard, String player1, String player2, int player){
 		Scanner lis= new Scanner(System.in);
		int choice;
		
		if (player%2==1) { //Player 1 turn
		System.out.println("\nChoose a space, "+ player1 );
		choice= lis.nextInt();
		}
		else {
			System.out.println("\nChoose a space, "+ player2 );
			choice= lis.nextInt();
		}
		
		switch(choice) {
		case 1:
			if(player%2==1) {
				gameboard[0][0]="X";
			}
			else {
				gameboard[0][0]="O";
			}
			break;
		case 2:
			if(player%2==1) {
				gameboard[0][1]="X";
			}
			else {
				gameboard[0][1]="O";
			}
			break;
		case 3:	
			if(player%2==1) {
				gameboard[0][2]="X";
			}
			else {
				gameboard[0][2]="O";
			}
			break;
		case 4:	
			if(player%2==1) {
				gameboard[1][0]="X";
			}
			else {
				gameboard[1][0]="O";
			}
			break;
		case 5:	
			if(player%2==1) {
				gameboard[1][1]="X";
			}
			else {
				gameboard[1][1]="O";
			}
			break;
		case 6:	
			if(player%2==1) {
				gameboard[1][2]="X";
			}
			else {
				gameboard[1][2]="O";
			}
			break;
		case 7:	
			if(player%2==1) {
				gameboard[2][0]="X";
			}
			else {
				gameboard[2][0]="O";
			}
			break;
		case 8:	
			if(player%2==1) {
				gameboard[2][1]="X";
			}
			else {
				gameboard[2][1]="O";
			}
			break;
		case 9:	
			if(player%2==1) {
				gameboard[2][2]="X";
			}
			else {
				gameboard[2][2]="O";
			}
			break;
		}
		player=player+1;
		return gameboard;
		
	}
	
	public static int CheckforWinner(String[][] gameboard, String player1, String player2, int turns) {
		
		
		if(gameboard[0][0]=="X"&& gameboard[0][1]=="X" &&gameboard[0][2]=="X") {//horizontal first row player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[0][0]=="0"&& gameboard[0][1]=="0" &&gameboard[0][2]=="0") { //horizontal first row player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[1][0]=="X"&& gameboard[1][1]=="X" &&gameboard[1][2]=="X") {//horizontal second row player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
		}
		else if (gameboard[1][0]=="O"&& gameboard[1][1]=="O" &&gameboard[1][2]=="O") {//horizontal second row player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[2][0]=="X"&& gameboard[2][1]=="X" &&gameboard[2][2]=="X") {//horizontal third row player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[2][0]=="O"&& gameboard[2][1]=="O" &&gameboard[2][2]=="O") { //horizontal third row player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[0][0]=="X"&& gameboard[1][0]=="X" &&gameboard[2][0]=="X") {//vertical first column player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[0][0]=="O"&& gameboard[1][0]=="O" &&gameboard[2][0]=="O") { //vertical first column player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[0][1]=="X"&& gameboard[1][1]=="X" &&gameboard[2][1]=="X") {//vertical second column player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[0][1]=="O"&& gameboard[1][1]=="O" &&gameboard[2][1]=="O") { //vertical second column player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[0][2]=="X"&& gameboard[1][2]=="X" &&gameboard[2][2]=="X") {//vertical third column player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[0][2]=="O"&& gameboard[1][2]=="O" &&gameboard[2][2]=="O") { //vertical third column player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[0][0]=="X"&& gameboard[1][1]=="X" &&gameboard[2][2]=="X") {//diagonal left to right  player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[0][0]=="O"&& gameboard[1][1]=="O" &&gameboard[2][2]=="O") { //diagonal left to right player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		else if (gameboard[0][2]=="X"&& gameboard[1][1]=="X" &&gameboard[2][0]=="X") {//diagonal right to left player 1
			System.out.println("\n"+player1.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		else if (gameboard[0][2]=="O"&& gameboard[1][1]=="O" &&gameboard[2][0]=="O") { //diagonal right to left player 2
			System.out.println("\n"+player2.toUpperCase()+ " YOU WIN!");
			turns=20;
		}
		//**********************************************************************
		return turns;
	}
	
	
}
