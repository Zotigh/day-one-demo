package edu.cnm.deepdive;

import java.util.Arrays;

public class CardExtractor {
  //Array of int from which card values will be drawn
  //and since it it an C language base you can write the array differently than int[] CARDS = etc... ie. int []CARDS = etc... and int CARDS[] = etc... all valid ways of writing this line of code
  private static final int[] CARDS = {3, 10, 11, 2, 4, 5, 12, 13, 1, 9, 8, 7, 6};

  /**
   * Application Entry Point. Usually same for every java program
   * @param args Command-Line arguments, specifing start and end positions
   */
  public static void main(String[] args) {
    int start = Integer.parseInt(args[0]); // parse element 0 of args (String) an int. everything in args is a string. parse gives you a new number a string is a sequence of chars. chars can act differently according to java program.
    int end = Integer.parseInt(args[1]);   //parse element 1 of args  (String) as int.
    System.out.println(start);             // system class is how the program connects to the outside world. here we are writing the value of start to the console.
    System.out.println(end);               // write the value of end to the console.
    int[] extracted = extract(start, end); //Invoke extract to obtain position of CARDS.
    String prettyExtract = Arrays.toString(extracted); //Use Arrays class to get a better version of the array.
    System.out.println(prettyExtract);     // This line prints the value of prettyExtract to the console.
  }


  /**
   * Creates and returns an int([](also known as an array)) containing some (or all) of CARDS.
   * @param start stsarting position (inclusive) of extraction
   * @param end   end position (exclusive) of extraction
   * @return      Copy of sub-array of CARDS
   */
  private static int[] extract(int start, int end){
    int[] extracted = //lines can be broken like this so they may become easier to read. after the = sign the console ignors all blank spaces after
        new int[end - start];// Allocate space for new array of int[]. for java new is usually the best way to declair and object like an array for example.
    for (int i = start; i < end; i++) {    // Iterate from start (inclusive) to end (exclusive).
      extracted[i - start] = CARDS[i];     //Assign value of CARDS element  i to the extracted element.
    }// ends the for loop
    return extracted;                      // Return (place reference to object on stack) extracted
  }                                        // this is a "primitive" it just has data or values but cannot do anything.
                                           // if a string is put on a stack it can do things.

}
