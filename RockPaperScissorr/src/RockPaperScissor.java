import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		String comp = "";
		
		int game = 0 + (int) (Math.random() * 3);
		
		if (game == 0){
			comp = "Rock";
		}
		else if (game == 1) {
			comp = "Paper";
		}
		else if (game == 2) {
			comp = "Scissors";
		}
	
		System.out.printf("Welcome to rock, paper, scissors game, please type Rock, Paper or Scissors to play\n");
		Scanner input = new Scanner(System.in);
		String player = input.next();
	
		if (player.equals("Rock") && comp.equals("Scissors")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Congratulations, you picked %s which beats %s. You have won the game.\n", player, comp);
		}
		else if (player.equals("Rock") && comp.equals("Rock")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("The game is a Tie. Please try again by restarting program", player , comp);
		}
		else if (player.equals("Rock") && comp.equals("Paper")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Sorry, but %s does not beat %s. You lose. Please try again by restarting program", player , comp);	
		}
		else if (player.equals("Paper") && comp.equals("Rock")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Congratulations, you picked %s which beats %s. You have won the game.\n", player, comp);
		}
		else if (player.equals("Paper") && comp.equals("Paper")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("The game is a Tie. Please try again by restarting program", player , comp);
		}
		else if (player.equals("Paper") && comp.equals("Scissors")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Sorry, but %s does not beat %s. You lose. Please try again by restarting program", player , comp);	
		}
		else if (player.equals("Scissors") && comp.equals("Rock")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Sorry, but %s does not beat %s. You lose Please try again by restarting program", player , comp);	
		}
		else if (player.equals("Scissors") && comp.equals("Paper")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Congratulations, you picked %s which beats %s. You have won the game.\n", player, comp);
		}
		else if (player.equals("Scissors") && comp.equals("Scissors")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("The game is a Tie. Please try again by restarting program", player , comp);
		}
		else if (player.equals("Rock") && comp.equals("Paper")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Sorry, but %s does not beat %s. Please try again by restarting program", player , comp);
		}
		else if (player.equals("Rock") && comp.equals("Scissors")){
			System.out.printf("The computer has chosen %s\n", comp);
			System.out.printf("Congratulations, you picked %s which beats %s. You have won the game.\n", player, comp);
		}
	}
}
	
	
	
	

		
		
