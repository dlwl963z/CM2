package cm.service.logic;

import java.util.List;

import cm.domain.Building;
import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.service.facade.ManageLectureService;

public class ManageLectureServiceLogic implements ManageLectureService{

	@Override
	public List<String> selectSchoolAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> selectDepartmentBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> selectDivisionBySchool(String school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lecture> selectLectureList(String school, String department, int year, String division,
			String lectureName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> selectLectureDetail(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Building> selectBuildings(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor selectProfessor(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lecture> selectLectureByProfessorId(int professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassTime selectClassTimeBylectureId(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
