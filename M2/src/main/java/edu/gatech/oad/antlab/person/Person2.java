package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	public static String calc(String input) {
        int[] randomNumbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            randomNumbers[i] = i;
        }
        Random rand = new Random();
        int randomNum;
        for (int i = randomNumbers.length - 1; i >= 0; i--) {
            randomNum = rand.nextInt(i + 1);
            int temp = randomNumbers[randomNum];
            randomNumbers[randomNum] = randomNumbers[i];
            randomNumbers[i] = temp;
        }
        String output = "";
        for (int i = 0; i < randomNumbers.length; i++) {
            output = output + input.charAt(randomNumbers[i]);
        }
        return output;
    	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
