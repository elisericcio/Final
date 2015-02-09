import java.util.ArrayList;
public class PickWord 
	{
	static ArrayList <String> theWord = new ArrayList <String>();	
	static String list[] = {"aardvark ", "football", "earthily", "feminist ", "firebird" ,"scorpion"};
	static String pickedWord;
	
	public static void word()
		{
		pickingWord();
		}
	public static void pickingWord()
		{
		for(int i =0; i < 8; i++)
			{
			theWord.add("_");
			}
		int randomWord = (int)(Math.random()*6);
		pickedWord = list[randomWord];
		PersonsPick.displayGrid();
	 
			}
		}
	
	
