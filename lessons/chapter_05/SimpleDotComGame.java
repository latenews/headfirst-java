import java.util.ArrayList;

class SimpleDotComGame {
  public static void main(String [] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    DotCom dot = new DotCom();

    int random = (int)(Math.random() * 5);
    /* int [] array = {random, random + 1, random + 2}; */
    ArrayList<String> array = new ArrayList<String>();
    array.add(random);
    
    dot.setLocationcells(array);
    boolean isAlive = true;
    
    while (isAlive == true) {
      String guess = helper.getUserInput("enter a number");
      String result = dot.checkYourself(guess);
      System.out.println(result);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("you took " + numOfGuesses + "guesses");
      }
    }
  }
}
