import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

class NewGameHelper{
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

class _DotCom {

    //int numOfHits = 0;
    private ArrayList<String> locationCells = new ArrayList<String>();

    public void setLocationCells(ArrayList<String> locs){
        this.locationCells = locs;
    }

    public String checkYourself(String guess){

        String result = "miss";
        int index = locationCells.indexOf(guess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            }
            else{
                result = "hit";
            }
        }
        return result;
}

public class DotComGame {    
    public void main(String[] args){

        int numOfGuesses = 0;
        boolean isAlive = true;
        
        _DotCom dot = new _DotCom();

        int loc1 = (int) (Math.random() * 4);

        String locString1 = String.valueOf(loc1);
        String locString2 = String.valueOf(loc1 + 1);
        String locString3 = String.valueOf(loc1 + 2);

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(locString1);
        locations.add(locString2);
        locations.add(locString3);


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
}
