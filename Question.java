
public class Question
{
	public String name;
	public String category;
	public String correctAnswer;
	public String wrongAnswer1;
	public String wrongAnswer2;
	public String wrongAnswer3;
	
	public Question(String name, String category, String correctAnswer, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3)
	{
		super();
		this.name = name;
		this.category = category;
		this.correctAnswer = correctAnswer;
		this.wrongAnswer1 = wrongAnswer1;
		this.wrongAnswer2 = wrongAnswer2;
		this.wrongAnswer3 = wrongAnswer3;
	}

	public Question()
	{
		// Empty constructor
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getCategory()
	{
		return category;
	}

	public String getCorrectAnswer()
	{
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer)
	{
		this.correctAnswer = correctAnswer;
	}

	public String getWrongAnswer1()
	{
		return wrongAnswer1;
	}

	public void setWrongAnswer1(String wrongAnswer1)
	{
		this.wrongAnswer1 = wrongAnswer1;
	}

	public String getWrongAnswer2()
	{
		return wrongAnswer2;
	}

	public void setWrongAnswer2(String wrongAnswer2)
	{
		this.wrongAnswer2 = wrongAnswer2;
	}

	public String getWrongAnswer3()
	{
		return wrongAnswer3;
	}

	public void setWrongAnswer3(String wrongAnswer3)
	{
		this.wrongAnswer3 = wrongAnswer3;
	}
	

	
	
}
