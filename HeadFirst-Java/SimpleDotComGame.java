import java.util.Scanner;
import java.io.*;

class GameHelper{
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
class SimpleDotCom {

    int numOfHits = 0;
    int[] locationCells;

    public void setLocationCells(int[] locs){
        this.locationCells = locs;
    }

    public String checkYourself(String guess){

        int userGuess = Integer.parseInt(guess);
        String result = "miss";

        for (int i : locationCells) {
            if (userGuess == i) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        return result;
    }
}

public class SimpleDotComGame {    
    public static void main(String[] args){

        int numOfGuesses = 0;
        boolean isAlive = true;
        SimpleDotCom dot = new SimpleDotCom();

        int loc1 = (int) (Math.random() * 4);
    
        int[] locations = {loc1, loc1 + 1, loc1 + 2};

        dot.setLocationCells(locations);

        while(isAlive == true){

            System.out.println("Enter a number");
            Scanner guess = new Scanner(System.in);
            String str = guess.nextLine();

            String result = dot.checkYourself(str);
            System.out.println(result);
            numOfGuesses++;

            if(result.equals("kill")){
                isAlive = false;
            }
        }

        System.out.println("It took you " + numOfGuesses + " guesses!");
        
    }
}
