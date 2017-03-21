package cm.domain;

import java.util.List;

public class Timetable {

	private int id;
	private String name;
	private List<Lecture> lectures;
	private int registYear;
	
	public Timetable() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	public int getRegistYear() {
		return registYear;
	}

	public void setRegistYear(int registYear) {
		this.registYear = registYear;
	}
	
	
}
