package cm.domain;

import java.util.List;

public class Wishlist {

	private int id;
	private List<Lecture> lectures;
	
	public Wishlist() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	
}
