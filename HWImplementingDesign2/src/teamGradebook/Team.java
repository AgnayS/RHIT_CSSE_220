/**Used to 
 * 
 * Class: Team
 * @author Agnay Srivastava
 * <br>Name: Used to hold the names of teams
 * <br>students: used to hold the number of students who are part of a team
 * <br>grades: add grade doubles to teams
 * <br>For example: 
 * <pre>
 * 		Team obj = new Team("Agnay");
 * </pre>
**/
package teamGradebook;

import java.util.ArrayList;

public class Team {

	private String name;

	private ArrayList<Student> students;

	private ArrayList<Double> grades;

//default constructors for team
	
	public Team() {
		name = null;
		students = new ArrayList<>();
		grades = new ArrayList<>();

	}
	
	//default constructors for team for a  given name
		public Team(String n) {
			this.name = n;
			students = new ArrayList<>();
			grades = new ArrayList<>();

		}
		
//toString for Team
	@Override
	public String toString() {
		return "Team [name=" + name + ", students=" + students + ", grades=" + grades + "]";
	}

//getter for name

	public String getName() {
		return name;
	}
//setter for grade, also add grade to team's instance variable
	public void addGrade(double grade) {
		grades.add(grade);

		for (int i = 0; i < students.size(); i++) {
			students.get(i).addGrade(grade);
		}

	}
	
//add students to team
	
	public void addStudents(ArrayList<Student> s) {
		for (int i = 0; i < s.size(); i++) {
			students.add(s.get(i));
		}
	}

	
//calculate average for team grades instance variables, ignore stuff in student
	
	public int calculateAverage() {
		double sum = 0;
		if (grades.size() == 0) {
			return (0);
		} else {
			for (int i = 0; i < grades.size(); i++) {
				sum += grades.get(i);
			}
			return ((int) Math.round(sum / grades.size()));
		}
	}
}


// TODO: Complete this class
// You'll need to add fields, constructors, and methods here
// Adhere to (1), (2), and (3) below

// (1) Requirements on Field Declaration Design/Engineering:
// -- Fields of this class must be declared with the 'private' access modifier -
// this provides compiler enforced encapsulation
// -- Getters/setters are not allowed for any field that is a collection, for
// example, no getter or setter for an ArrayList field
// This restriction keeps these complex internal data structures 'private',
// i.e., encapsulated

// (2) Requirements on New Method Design/Engineering:
// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Team
// That is, if your app needs something computed using the data stored in the
// Team class,
// then design/engineer the Team class so that it implements the computation
// inside a new 'public' Team method.
// Then a client can 'tell' Team to do that computation by calling this new Team
// method

// (3) Requirements for Student's toString Method:
// Implement a toString method that returns a String containing the values in
// the object's fields
// After adding fields to this class, use the Eclipse command: Source | Generate
// toString
// When debugging, call this toString method on Team objects from a
// System.out.println command
