package generate;

import java.util.ArrayList;

public class University {

	public String name;

	public ArrayList<Faculty> faculties;

	public University(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFaculties(ArrayList<Faculty> faculties) {
		this.faculties = faculties;
	}

	public ArrayList<Faculty> getFaculties() {
		return faculties;
	}

}