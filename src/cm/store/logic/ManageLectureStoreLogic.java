package cm.store.logic;

import java.util.List;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.store.facade.ManageLectureStore;

public class ManageLectureStoreLogic implements ManageLectureStore{

	@Override
	public List<String> searchSchoolAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> searchDepartmentBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> searchDivisionBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lecture> searchLecturelist(String school, String department, int year, String division,
			String lectureName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lecture searchLectureDetail(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Building searchBuilding(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor searchProfessor(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lecture> searchLectureByLectureId(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
