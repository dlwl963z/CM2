package cm.service.logic;

import java.util.List;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.service.facade.ManageLectureService;

public class ManageLectureServiceLogic implements ManageLectureService{

	public List<String> selectSchoolAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> selectDepartmentBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> selectDivisionBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Lecture> selectLectureList(String school, String department, int year, String division,
			String lectureName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Lecture selectLectureDetail(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Building selectBuilding(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor selectProfessor(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean createLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean updateLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean removeLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Lecture> selectLectureByLectureId(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}


}
