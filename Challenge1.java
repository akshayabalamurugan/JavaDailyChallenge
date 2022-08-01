package javachallenge;
public class Challenge1 {
public static void main(String[] args) {
		//declare the input string
		String s = "uffy is still joyboy";
		//convert input string to string array
		String[] sArray= s.split(" ");
		//store last word present in string array as a string
		String temp= sArray[sArray.length-1];
		//print the length of string
		System.out.println(temp.length());
	}
}
