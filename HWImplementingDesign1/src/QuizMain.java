import java.util.ArrayList;
import java.util.HashMap;

/**
  *  This class is used to demonstrate a functional design
  *  involving Quizzes and Questions which can be updated and displayed
  * 
  */
public class QuizMain {
	
	
	HashMap <Integer,Question> Questions = new HashMap<>();
	
	HashMap <Integer,Quiz> Quizzes = new HashMap<>();
	
	
	
		// TODO In order to demonstrate functionality, please follow the TODOs below
		// You will have to create questions and quizzes when a QuizMain is created
		
		
		// TODO 1 Create five questions (can be silly/basic questions) use id 1,2,3,4,5 ...
	

		// TODO 2 Create three or more quizzes  use id 1,2,3...
		//      (One quiz should share at least one question with another )

	public QuizMain() {

		
		Questions.put(0,new Question(0,"What is your name?"));
		Questions.put(1,new Question(1,"What is your age?"));
		Questions.put(2,new Question(2,"Do you have any pets?"));
		Questions.put(3,new Question(3,"What is 10 * 20?"));
		Questions.put(4,new Question(4,"Are you non-vegetarian?"));
		

		Quizzes.put(0,new Quiz(0,0,2,4));
		Quizzes.put(1,new Quiz(1,1,2,3));
		Quizzes.put(2,new Quiz(2,0,3,2));
		Quizzes.put(3,new Quiz(3,1,4,2));
		Quizzes.put(4,new Quiz(4,1,3,2));

	}
	
	
	
	public static void main(String[] args) {
		//We want to use instance variables of the QuizMain class so we need to construct a QuizMain object
		QuizMain myQuizSimulator = new QuizMain();
		
		// TODO 3 Display three or more different quizzes
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more original quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
		
		
		// TODO 4 Change two quiz questions 
		// A. (One should be shared with two or more quizzes)
		// B. (One should be unique to one quiz)
		myQuizSimulator.handleUpdateQuizQuestion(1,"What is different 1?");
		myQuizSimulator.handleUpdateQuizQuestion(2,"What is different 2?");
		
		
		// TODO 5 Display the same three (or more) quizzes
		//	   A. One that has a unique question which changed
		//	   B. Two which share a question that has been changed		
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more changed quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);
		
	}
	
	/**
	 *  This method should display a quiz in a very similar fashion to the output provided
	 *  in exampleOutput.txt, which is located in your repository
	 * 
	 * 
	 * @param quizId
	 */
	public void handleDisplayQuiz(int quizId) 
	{
		printQuestions(quizId);
		System.out.println();
	}
	
	public void printQuestions(int quizID)
	{
		
		for (Integer i: Quizzes.get(quizID).getQuestionList())
		{
			System.out.println(Questions.get(i).getQuestion());
		}
		
		
	}
	
	/**
	 * 
	 * This method should replace the data in the question with id=questionId with the new questionData 
	 * 
	 * @param questionId
	 * @param questionData
	 */
	public void handleUpdateQuizQuestion(int questionId, String questionData) 
	{
		
		Question temp = new Question(questionId,questionData);
		//Questions.get(questionId).changeQuestion(questionData);
		
		Questions.replace(questionId,temp);
	}

}
