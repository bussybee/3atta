package generate;

import java.util.ArrayList;

public class ResearchEmployee extends Employee {

	public ArrayList<Project> projects;
	public Institute institute;
	public String researchArea;

	public ResearchEmployee(String name, int ssNo, String email, int numberOfEmployers) {
		super(name, ssNo, email, numberOfEmployers);
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public String getResearchArea() {
		return researchArea;
	}

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	public void doResearchWork() {
		// TODO - implement ResearchEmployee.doResearchWork
		throw new UnsupportedOperationException();
	}

}