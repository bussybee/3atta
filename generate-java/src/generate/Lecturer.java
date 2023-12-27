package generate;

import java.util.ArrayList;

public class Lecturer extends ResearchEmployee {

	public ArrayList<Course> courses;
	public Lecturer(String name, int ssNo, String email, int numberOfEmployers) {
		super(name, ssNo, email, numberOfEmployers);
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void teach() {
		// TODO - implement Lecturer.teach
		throw new UnsupportedOperationException();
	}

	public void getStudentsMarks() {
		// TODO - implement Lecturer.getStudentsMarks
		throw new UnsupportedOperationException();
	}

}