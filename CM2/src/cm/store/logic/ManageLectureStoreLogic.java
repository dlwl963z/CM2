package cm.store.logic;

import java.util.List;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.store.facade.ManageLectureStore;

public class ManageLectureStoreLogic implements ManageLectureStore{

	public List<String> searchSchoolAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> searchDepartmentBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> searchDivisionBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Lecture> searchLecturelist(String school, String department, int year, String division,
			String lectureName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Lecture searchLectureDetail(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Building searchBuilding(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor searchProfessor(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean insertLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean modifyLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Lecture> searchLectureByLectureId(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
