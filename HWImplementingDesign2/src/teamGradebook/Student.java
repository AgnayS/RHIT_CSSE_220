/**Used to 
 * 
 * Class: Student
 * @author Agnay Srivastava
 * <br>Name: Used to hold the names of students
 * <br>absences: int to hold no of absences
 * <br>grades: add grade doubles to students
 * <br>For example: 
 * <pre>
 * 		Student obj = new Student("Agnay");
 * </pre>
**/


package teamGradebook;

import java.util.ArrayList;

public class Student {

	private String name;
	private int absences;
	private ArrayList<Double> grades;

//default constructors

	public Student() {
		name = null;
		absences = 0;
		grades = new ArrayList<Double>();
	}

//constructor for creating a student when a name is given
	public Student(String n) {
		name = n;
		absences = 0;
		grades = new ArrayList<>();
	}

////constructor for creating a student when a name and absence is given	
	public Student(String n, int a) {
		name = n;
		absences = a;
		grades = new ArrayList<Double>();
	}

	
//setters and getters	

	public void setName(String n) {
		name = n;
	}

	
	public String getName() {
		return name;
	}

	public void addAbsence() {
		absences++;
	}

	public String getAbsences() {
		return Integer.toString(absences);
	}

	public void addGrade(double d) {
		grades.add(d);
	}

//returns grades for a string
	
	public String getGrades() {
		if (grades.size() == 0) {
			return Integer.toString(0);
		} else {
			String g = "";
			for (int i = 0; i < grades.size(); i++) {
				g = g + Double.toString(grades.get(i));
				g = g + " ";
			}

			return g;
		}
	}

//gets average for student grades	
	public String calculateAverage() {
		double sum = 0;
		if (grades.size() == 0) {
			return Integer.toString(0);
		} else {
			for (int i = 0; i < grades.size(); i++) {
				sum += grades.get(i);
			}
			return Integer.toString((int) Math.round(sum / grades.size()));
		}
	}

//to string method for student	
	@Override
	public String toString() {
		return "Student [name=" + name + ", absences=" + absences + ", grades=" + grades + "]";
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
	// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Student
	// That is, if your app needs something computed using the data stored in the
	// Student class,
	// then design/engineer the Student class so that it implements the computation
	// inside a new 'public' Student method.
	// Then a client can 'tell' Student to do that computation by calling this new
	// Student method

	// (3) Requirements for Student's toString Method:
	// Implement a toString method that returns a String containing the values in
	// the object's fields
	// After adding fields to this class, use the Eclipse command: Source | Generate
	// toString
	// When debugging, call this toString method on Student objects from a
	// System.out.println command
}
