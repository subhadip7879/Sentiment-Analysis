import java.io.*;
import java.util.Scanner;

public class Driver {
	
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		//String query = userInput.nextLine();
		try 
		{
			ProcessData  p = new ProcessData("/home/subhadip/Downloads/aclImdb/train");	
			//p.test("/home/subhadip/Downloads/aclImdb/test");
			p.findSentiment(" I haven't seen this funny of a show on fox in a long time, and the wait was worth it. The kids in the show have something that i can relate to on every episode, and even my dad will sit down and watch it. It is a show not for all ages that doesn't dumb down for kids. It is like still standing but to the next level. The stuff that everyone says is stuff that everyone says and actions that everyone does. It says stuff that we all think, but in a well rounded way of presentation. The first time i saw the show i could not believe that it was on fox, and that it was allowed to stay on the air after a few episodes, from Hilary's boyfriend choices to Kenny's boyfriend choices, it is well worth the watch.\n" + 
					"");
		}			
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}			
	}

}
