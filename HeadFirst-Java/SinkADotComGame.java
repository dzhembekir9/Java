import java.io.*;
import java.util.ArrayList;

class AdvancedGameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;
  
  
    public String getUserInput(String prompt) {
       String inputLine = null;
       System.out.print(prompt + "  ");
       try {
         BufferedReader is = new BufferedReader(
       new InputStreamReader(System.in));
         inputLine = is.readLine();
         if (inputLine.length() == 0 )  return null; 
       } catch (IOException e) {
         System.out.println("IOException: " + e);
       }
       return inputLine.toLowerCase();
    }
  
    
    
   public ArrayList<String> placeDotCom(int comSize) {                 // line 19
      ArrayList<String> alphaCells = new ArrayList<String>();
      String [] alphacoords = new String [comSize];      // holds 'f6' type coords
      String temp = null;                                // temporary String for concat
      int [] coords = new int[comSize];                  // current candidate coords
      int attempts = 0;                                  // current attempts counter
      boolean success = false;                           // flag = found a good location ?
      int location = 0;                                  // current starting location
      
      comCount++;                                        // nth dot com to place
      int incr = 1;                                      // set horizontal increment
      if ((comCount % 2) == 1) {                         // if odd dot com  (place vertically)
        incr = gridLength;                               // set vertical increment
      }
  
      while ( !success & attempts++ < 200 ) {             // main search loop  (32)
      location = (int) (Math.random() * gridSize);      // get random starting point
          //System.out.print(" try " + location);
      int x = 0;                                        // nth position in dotcom to place
          success = true;                                 // assume success
          while (success && x < comSize) {                // look for adjacent unused spots
            if (grid[location] == 0) {                    // if not already used
               coords[x++] = location;                    // save location
               location += incr;                          // try 'next' adjacent
               if (location >= gridSize){                 // out of bounds - 'bottom'
                 success = false;                         // failure
               }
               if (x>0 & (location % gridLength == 0)) {  // out of bounds - right edge
                 success = false;                         // failure
               }
            } else {                                      // found already used location
                // System.out.print(" used " + location);  
                success = false;                          // failure
            }
          }
      }                                                   // end while
  
      int x = 0;                                          // turn good location into alpha coords
      int row = 0;
      int column = 0;
      // System.out.println("\n");
      while (x < comSize) {
        grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
        row = (int) (coords[x] / gridLength);             // get row value
        column = coords[x] % gridLength;                  // get numeric column value
        temp = String.valueOf(alphabet.charAt(column));   // convert to alpha
        
        alphaCells.add(temp.concat(Integer.toString(row)));
        x++;
  
        // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
        
      }
      // System.out.println("\n");
      
      return alphaCells;
     }
  }
  

class DotCom {

    private String name;
    private ArrayList<String> locationCells = new ArrayList<String>();

    public void setLocationCells(ArrayList<String> locs){
        this.locationCells = locs;
    }

    public void setDotName(String dotName){
        this.name = dotName;
    }

    public String checkYourself(String guess){

        String result = "miss";
        int index = locationCells.indexOf(guess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name);
            }
            else{
                result = "hit";
            }
        }
        return result;
    }
}

class DotComBust {   
    
    private AdvancedGameHelper helper = new AdvancedGameHelper();;
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){

        DotCom dot1 = new DotCom();
        DotCom dot2 = new DotCom();
        DotCom dot3 = new DotCom();

        dot1.setDotName("Russian Dot");
        dot2.setDotName("German Dot");
        dot3.setDotName("British Dot");

        dotComList.add(dot1);
        dotComList.add(dot2);
        dotComList.add(dot3);

        System.out.println("Three Dot Coms created. Ready to play!");
        System.out.println("Your goal is to sink all three of them in the fewest number of guesses.");
        System.out.println("Dot Coms: Russian Dot, German Dot, British Dot");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
    }

    public void checkUserGuess(String userGuess){

        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Game over!");
        if (numOfGuesses <= 18) {
            System.out.println("Congratulations! It took you " + numOfGuesses + " guesses!");
        }
        else {
            System.out.println(":( It took you " + numOfGuesses + " guesses!");
        }
        
    }
    public static void main(String[] args){

        DotComBust newGame = new DotComBust();

        newGame.setUpGame();
        newGame.startPlaying();
        newGame.finishGame();
    }    
}

