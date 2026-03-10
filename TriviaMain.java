import java.util.*;

public class TriviaMain
{

	public static void main(String[] args)
	{
		int wager;
		int score = 0;
		int questionCounter = 0;
		boolean correct;
		String selectedCategory;
		
		System.out.println("Welcome to trivia game!\n");
		
		System.out.println("Please select from the following categories.");
		
		Question select1 = new Question();
		select1 = selectQuestions();
		Question select2 = new Question();
		select2 = selectQuestions();
		Question select3 = new Question();
		select3 = selectQuestions();
		
		System.out.println(select1.getCategory());
		System.out.println(select2.getCategory());
		System.out.println(select3.getCategory());
		
		Scanner input = new Scanner(System.in);
		selectedCategory = input.nextLine();
		
		System.out.println("Place your wager.");
		wager = input.nextInt();
		
		if(selectedCategory.equalsIgnoreCase(select1.getCategory()))
		{
			ArrayList<String> answerChoices = new ArrayList<String>();
			String choice1 = select1.getCorrectAnswer();
			String choice2 = select1.getWrongAnswer1();
			String choice3 = select1.getWrongAnswer2();
			String choice4 = select1.getWrongAnswer3();
			
			answerChoices.add(choice1);
			answerChoices.add(choice2);
			answerChoices.add(choice3);
			answerChoices.add(choice4);
			Collections.shuffle(answerChoices);
			
			System.out.println(select1.getName() + "\n");
			
			System.out.println("A)" + answerChoices.get(0));
			System.out.println("B)" + answerChoices.get(1));
			System.out.println("C)" + answerChoices.get(2));
			System.out.println("D)" + answerChoices.get(3));
			
			Scanner sc = new Scanner(System.in);
			String guess = sc.nextLine();
			if(guess.equalsIgnoreCase("A"))
			{
				if(choice1.equals(answerChoices.get(0)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("B"))
			{
				if(choice1.equals(answerChoices.get(1)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("C"))
			{
				if(choice1.equals(answerChoices.get(2)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("D"))
			{
				if(choice1.equals(answerChoices.get(3)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
		}
		else if(selectedCategory.equalsIgnoreCase(select2.getCategory()))
		{
			ArrayList<String> answerChoices = new ArrayList<String>();
			String choice1 = select2.getCorrectAnswer();
			String choice2 = select2.getWrongAnswer1();
			String choice3 = select2.getWrongAnswer2();
			String choice4 = select2.getWrongAnswer3();
			
			answerChoices.add(choice1);
			answerChoices.add(choice2);
			answerChoices.add(choice3);
			answerChoices.add(choice4);
			Collections.shuffle(answerChoices);
			
			System.out.println(select2.getName() + "\n");
			
			System.out.println("A)" + answerChoices.get(0));
			System.out.println("B)" + answerChoices.get(1));
			System.out.println("C)" + answerChoices.get(2));
			System.out.println("D)" + answerChoices.get(3));
			
			Scanner sc = new Scanner(System.in);
			String guess = sc.nextLine();
			if(guess.equalsIgnoreCase("A"))
			{
				if(choice1.equals(answerChoices.get(0)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("B"))
			{
				if(choice1.equals(answerChoices.get(1)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("C"))
			{
				if(choice1.equals(answerChoices.get(2)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("D"))
			{
				if(choice1.equals(answerChoices.get(3)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
		}
		else if(selectedCategory.equalsIgnoreCase(select3.getCategory()))
		{
			ArrayList<String> answerChoices = new ArrayList<String>();
			String choice1 = select3.getCorrectAnswer();
			String choice2 = select3.getWrongAnswer1();
			String choice3 = select3.getWrongAnswer2();
			String choice4 = select3.getWrongAnswer3();
			
			answerChoices.add(choice1);
			answerChoices.add(choice2);
			answerChoices.add(choice3);
			answerChoices.add(choice4);
			Collections.shuffle(answerChoices);
			
			System.out.println(select3.getName() + "\n");
			
			System.out.println("A)" + answerChoices.get(0));
			System.out.println("B)" + answerChoices.get(1));
			System.out.println("C)" + answerChoices.get(2));
			System.out.println("D)" + answerChoices.get(3));
			
			Scanner sc = new Scanner(System.in);
			String guess = sc.nextLine();
			if(guess.equalsIgnoreCase("A"))
			{
				if(choice1.equals(answerChoices.get(0)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("B"))
			{
				if(choice1.equals(answerChoices.get(1)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("C"))
			{
				if(choice1.equals(answerChoices.get(2)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
			else if(guess.equalsIgnoreCase("D"))
			{
				if(choice1.equals(answerChoices.get(3)))
				{
					correct = true;
					System.out.println("Correct!");
					System.out.println(updateScore(score,wager,correct));
				}
				else
				{
					correct = false;
					System.out.println("Incorrect.");
					System.out.println(updateScore(score,wager,correct));
				}
			}
		}
		questionCounter++;
	}
	
	public static int updateScore(int score, int wager, boolean correct)
	{
		int oldScore = score;
		int newScore = 0;
		int change = wager;
		boolean posOrNeg = correct;
		
		if(posOrNeg == true)
		{
			newScore = oldScore + change;
		}
		else if(posOrNeg == false)
		{
			newScore = oldScore - change;
		}
		
		return newScore;
	}
	
	public static Question selectQuestions()
	{
		ArrayList<Question> questions = new ArrayList<Question>();
		Question q1 = new Question("In what year did Star Wars release?", "Movies", "1977", "1980", "1975", "1982");
		questions.add(q1);
		Question q2 = new Question("What team won Superbowl 60?", "Sports", "Seattle Seahawks", "Kansas City Chiefs", "New England Patriots", "Denver Broncos");
		questions.add(q2);
		Question q3 = new Question("How many $500 bills are included in a modern edition of Monopoly?", "Board Games", "40", "20", "30", "25");
		questions.add(q3);
		Question q4 = new Question("In what year did the American Revolution end?", "American History", "1783", "1778", "1780", "1786");
		questions.add(q4);
		Question q5 = new Question("Who is the CEO of Facebook?", "Social Media", "Mark Zuckerberg", "Bill Gates", "Jeff Bezos", "Ted Sarandos");
		questions.add(q5);
		Question q6 = new Question("What videogame contains the famous \"BLJ\" glitch?", "Videogames", "Super Mario 64", "The Legend of Zelda: Ocarina of Time", "Donkey Kong 64", "Crash Bandicoot");
		questions.add(q6);
		Question q7 = new Question("What is the only planet in our solar system to rotate clockwise on its axis?", "Astronomy", "Venus", "Mercury", "Jupiter", "Neptune");
		questions.add(q7);
		Question q8 = new Question("How many states does the Appalachian Trail cross?", "Geography", "14", "8", "10", "16");
		questions.add(q8);
		Question q9 = new Question("M&M’S Fruit Chews would eventually become what popular candy?", "Food", "Starburst", "Skittles", "Hi-Chew", "Dots");
		questions.add(q9);
		Question q10 = new Question("What guitarist performed on the Michael Jackson song \"Beat it\"?", "Music", "Eddie Van Halen", "Jimmy Page", "Randy Rhoades", "Stevie Ray Vaughn");
		questions.add(q10);
		Question q11 = new Question("Which of these Sci-Fi movies did Steven Spielburg not help create?", "Movies", "2001: A Space Odessey", "Back to the Future", "Ready Player One", "E.T.");
		questions.add(q11);
		Question q12 = new Question("What’s the diameter of a basketball hoop in inches?", "Sports", "18 inches", "14 inches", "20 inches", "17 inches");
		questions.add(q12);
		Question q13 = new Question("In what year was the first Scrabble board game sold?", "Board Games", "1948", "1961", "1954", "1966");
		questions.add(q13);
		Question q14 = new Question("Who was the 23rd President of the United States?", "American History", "Benjamin Harrison", "James Buchanan", "Theodore Roosevelt", "Woodrow Wilson");
		questions.add(q14);
		Question q15 = new Question("What is one of the few social media platforms to still have a form of dislikes?", "Social Media", "Reddit", "Instagram", "Blue Sky", "Facebook");
		questions.add(q15);
		Question q16 = new Question("Which videogame series features a half demon who wields a sword and twin pistols?", "Videogames", "Devil May Cry", "Resident Evil", "Kid Icarus", "Persona");
		questions.add(q16);
		Question q17 = new Question("What galaxy is the closest to the Milky Way?", "Astronomy", "Andromeda Galaxy", "Black Eye Galaxy", "Helix Galaxy", "Southern Pinwheel Galaxy");
		questions.add(q17);
		Question q18 = new Question("Which of these countries is landlocked?", "Geography", "Austria", "Germany", "Bulgeria", "Latvia");
		questions.add(q18);
		Question q19 = new Question("What was the first pizza restaurant chain to deliver?", "Food", "Domino's", "Pizza Hut", "Fox's Den", "Little Caeser's");
		questions.add(q19);
		Question q20 = new Question("Which of these bands has a one-armed drummer?", "Music", "Def Leppard", "Metallica", "Van Halen", "Whitesnake");
		questions.add(q20);
		
		Random r = new Random();
		return questions.get(r.nextInt(questions.size()));
	}

}
