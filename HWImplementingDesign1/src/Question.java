import java.util.HashMap;

/**
 * Class: QuizMain
 * @author Agnay Srivastava, Pranav Vishnu
 * <br>id: Used to hold id for each object
 * <br>QuestionQuery: Used to hold the String for each question object
 * <br>Restrictions: Cannot be used for Taking Quizzes
 * <br>For example: 
 * <pre>
 * 		Question obj = new Question(0,"What is your name?");
 * </pre>
 */

public class Question 
{
	int id;
	String QuestionQuery;
	
	Question (int id , String query)
	{
		this.id = id;
		QuestionQuery = query;
	}
	
	
	public String getQuestion()
	{
		return this.QuestionQuery;	  //getter for returning the string in a Question object
	}
	
	
	
	public void changeQuestion(String question)
	{
		
		this.QuestionQuery = question;			//Setter for changing the string in a question object
		
	}
	
	
}
