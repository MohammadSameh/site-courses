import java.util.ArrayList;

public class CourseQuiz implements Quiz {
	private String quizTitle;
    private int totalQuestions;
    private String difficultyLevel;
    private int passingScore;
    private Instructor instructor; // we will link it with instructor class
    private ArrayList<Student> student = new ArrayList<>(); // will be linked with students class

    public CourseQuiz(String quizTitle, int totalQuestions, String difficultyLevel, int passingScore, Instructor instructor) {
        this.quizTitle = quizTitle;
        this.totalQuestions = totalQuestions;
        this.difficultyLevel = difficultyLevel;
        this.passingScore = passingScore;
        this.instructor = instructor; // will be linked with constructor class
        
    }

    @Override
    public String getQuizTitle() {
        return quizTitle;
    }

    @Override
    public int getTotalQuestions() {
        return totalQuestions;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public int getPassingScore() {
        return passingScore;
    }
    public Instructor getInstructor() { // wil be linked with instructor class
		return this.instructor;
	}
	public void setInstructor(Instructor inst) { // will be linked with instructor class
		this.instructor = inst;
	}
	public void showStudents() {
		for(int i = 0; i < this.student.size(); i++) {
			System.out.println(this.student.get(i).getUsername());
		}
	}
	public void addStudent(Student x) {
		this.student.add(x);
	}
	
}

interface Quiz {
    String getQuizTitle();
    int getTotalQuestions();
}
