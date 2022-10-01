import java.util.ArrayList;
/**
 * Class: QuizMain
 * @author Agnay Srivastava, Pranav Vishnu
 * <br>id: Used to hold id for each object of Quiz
 * <br>Restrictions: Cannot be used for Setting one or getting all Questions
 * <br>For example: 
 * <pre>
 * 		Quiz obj = new Question(1,"What is your age?");
 * </pre>
 */

public class Quiz 
{
	int id;
	
	ArrayList<Integer> b= new ArrayList<>();
	
	public Quiz(int id, int QID1, int QID2, int QID3)
	{
		this.id = id;                      //set id
		b.add(QID1);						//Store all the Question IDs that are part of this quiz in an arraylist b
		b.add(QID2);
		b.add(QID3);
		
	}

	public ArrayList<Integer> getQuestionList()  //return the arraylist containing all of the Question ids for a particular Quiz object
	{
		return b;
	}
}
