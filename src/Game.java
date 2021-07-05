import java.util.Scanner;

public class Game {


    public static void main(String[] args){
        MovieName game = new MovieName();
        char[] wrongLetters = new char[9];

        int count = 0;
        while(count < 10) {

            if ( game.hiddenName.equals(game.realName) == true){
                System.out.println("You won the game. You guessed the word : " + game.realName);
                break;
            }
            System.out.println("You are guessing : " + game.hiddenName);
            System.out.println("You have guessed ( " + count + " ) wrong letters : ");
            for(int i = 0; i < count; i ++)
                System.out.println(new String(wrongLetters));

            Scanner scan = new Scanner(System.in);
            System.out.println("Guess a letter : ");
            char ch = scan.next().charAt(0);

            //check if the letter is in name of the movie
            int pos = game.realName.indexOf(ch);

            if(pos == -1)
            {
                wrongLetters[count] = ch;
                count ++;
            }

            while(pos != -1) {
                game.hiddenName = game.hiddenName.substring(0,pos) + ch + game.hiddenName.substring(pos+1);
                pos = game.realName.indexOf(ch, pos+1);


            }

            if(count == 10){

                System.out.println("Game over :(. The word was : " + game.realName);
            }

        }

    }
}
