
public class HangingMan 
{
	public static void stepsToHang()
		{
		System.out.println(PersonsPick.wrongGuessCounter);
		if (PersonsPick.guessesCounter == 9)
			{
			firstHang();
			}
		if (PersonsPick.guessesCounter ==8)
			{
			secondHang();
			}
		if (PersonsPick.guessesCounter ==7)
			{
			thirdHang();
			}
		if (PersonsPick.guessesCounter ==6)
			{
			forthHang();
			}
		if (PersonsPick.guessesCounter ==5)
			{
			fithHang();
			}
		if (PersonsPick.guessesCounter ==4)
			{
			sixthHang();
			}
		if (PersonsPick.guessesCounter ==3)
			{
			seventhHang();
			}
		if (PersonsPick.guessesCounter ==2)
			{
			eighthHang();
			}
		if (PersonsPick.guessesCounter ==1)
			{
			ninethHang();
			}
		if (PersonsPick.guessesCounter ==0)
			{
			tenthHang();
			System.out.println("You killed him. Game over!");
			}
		}
	public static void firstHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void secondHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |    |");
		System.out.println("  |     ");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void thirdHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |    |-");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void forthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |   -|-");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void fithHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |   -|-<");
		System.out.println("  |    ");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void sixthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |    ");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void seventhHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |     \\");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void eighthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |   / \\");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void ninethHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |   / \\");
		System.out.println("  |  * "  );
		System.out.println(" ---");
		}
	public static void tenthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |   / \\");
		System.out.println("  |  *   *"  );
		System.out.println(" ---");
		}
}
