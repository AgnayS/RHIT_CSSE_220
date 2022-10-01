/**Used to 
 * 
 * Class: TeamGradeBook
 * @author Agnay Srivastava
 * <br>students: used to hold the number of students who are part of a team
 * <br>teams: used to hold the number of teams
 * <br>For example: 
 * <pre>
 * 		TeamGradebook obj = new TeamGradeBook();
 * </pre>
**/
package teamGradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamGradebook {

//declare instance variables to hold student and team objects
	
	private ArrayList<Student> students;
	private ArrayList<Team> teams;

	
//default constructors
	public TeamGradebook() 
	{
		//initialize variables
		students = new ArrayList<>();
		teams = new ArrayList<>();
	}

//add students by creating a new object and setting its value 
	
	private String handleAddStudent(String studentName) 
	{
		Student obj = new Student();
		obj.setName(studentName);
		students.add(obj);
		return "ok";
	}

//add +1 to the student object calling add absence
	
	private String handleAddAbsence(String studentName) {

		getStudentByName(studentName).addAbsence();
		return "ok";
	}

//get absences for a student 	
	private String handleGetAbsences(String studentName) {
		return getStudentByName(studentName).getAbsences();
	}

//add grades for all students in a team
	private String handleAddGrade(String teamName, double grade) {
		getTeamByName(teamName).addGrade(grade);
		return "ok";
	}

//get grades for a student
	
	private String handleGetStudentGrades(String studentName) {
		return (studentName + " " + getStudentByName(studentName).getGrades());
	}

	
//create an arraylist of students for member names and then passes it to the team object for adding
	private String handleAddTeam(String teamName, ArrayList<String> memberNames) {
		Team obj = new Team(teamName);

		ArrayList<Student> s = new ArrayList<>();

		for (int i = 0; i < memberNames.size(); i++) {
			s.add(getStudentByName(memberNames.get(i)));
		}

		obj.addStudents(s);

		teams.add(obj);

		return "ok";
	}

//get the student object for a given student name 
	public Student getStudentByName(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equalsIgnoreCase(name)) {
				return students.get(i);
			}

		}
		Student obj = new Student(name);
		students.add(obj);
		return obj;

	}

//get the team object for a given object name	
	public Team getTeamByName(String name) {
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).getName().equalsIgnoreCase(name)) {
				return teams.get(i);
			}

		}
		Team obj = new Team(name);
		teams.add(obj);
		return obj;
	}

//get average of student grades
	
	private String handleGetAverage(String studentName) {
		return (getStudentByName(studentName).calculateAverage());
	}
	
//get average for each of the teams and store the best team
	private String handleGetBestTeam() {
		int max = 0;
		String bestTeam = "";
		if (teams.size() == 1) {
			return teams.get(0).getName();
		}

		for (int i = 0; i < teams.size(); i++) {
			int Average = teams.get(i).calculateAverage();

			if (max < Average) {
				max = Average;
				bestTeam = teams.get(i).getName();
			}

		}

		return bestTeam;
	}

	/**
	 * Decodes a command and invokes the right method.
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * HINT: You might find it useful for debugging if you add 2 additional
	 * commands: display-students - performs a System.out.println of the 'students'
	 * ArrayList display-teams - performs a System.out.println of the 'teams'
	 * ArrayList Follow the 'if' add-student (below), and just return "ok"; after
	 * the println
	 * 
	 * You don't have to understand how this function works, and you don't have to
	 * change it. But it's not that hard - feel free to figure it out if you like.
	 * 
	 * @param command The command to decode
	 * @return the results of the command. "ok" if success but no result.
	 */
	public String handleCommand(String command) {
		Scanner input = new Scanner(command);
		String commandType = input.next();

		if (commandType.equals("add-student")) {
			String studentName = input.next();
			input.close();
			return handleAddStudent(studentName);
		}

		if (commandType.equals("add-absence")) {
			String studentName = input.next();
			input.close();
			return handleAddAbsence(studentName);
		}

		if (commandType.equals("get-absences")) {
			String studentName = input.next();
			input.close();
			return handleGetAbsences(studentName);
		}

		if (commandType.equals("get-student-grades")) {
			String studentName = input.next();
			input.close();
			return handleGetStudentGrades(studentName);
		}

		if (commandType.equals("add-team")) {
			String teamName = input.next();
			ArrayList<String> memberNames = new ArrayList<String>();
			while (input.hasNext()) {
				memberNames.add(input.next());
			}
			input.close();
			return handleAddTeam(teamName, memberNames);
		}

		if (commandType.equals("add-grade")) {
			String teamName = input.next();
			double grade = input.nextDouble();
			input.close();
			return handleAddGrade(teamName, grade);
		}

		if (commandType.equals("get-average")) {
			String studentName = input.next();
			input.close();
			return handleGetAverage(studentName);
		}

		if (commandType.equals("get-best-team")) {
			input.close();
			return handleGetBestTeam();
		}

		if (commandType.equals("exit")) {
			System.exit(0);
		}

		input.close();
		return "Unknown command " + commandType;
	}

	@Override
//toString method for all variables of TeamGradeBook	
	public String toString() {
		return "TeamGradebook [students=" + students + ", teams=" + teams + "]";
	}


	public static void main(String[] args) {
		TeamGradebook book = new TeamGradebook();
		System.out.println("Welcome to Team Gradebook.  Enter commands.  Type 'exit' to end.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String commandLine = scanner.nextLine();
			String result = book.handleCommand(commandLine);
			System.out.println(result);
		}

	}

}
