package cm.service.logic;

import java.util.List;

import cm.domain.Building;
import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.service.facade.ManageLectureService;
import cm.store.facade.ManageLectureStore;
import cm.store.logic.ManageLectureStoreLogic;

public class ManageLectureServiceLogic implements ManageLectureService{
	private ManageLectureStore store;
	
	public ManageLectureServiceLogic(){
		store = new ManageLectureStoreLogic();
	}
	@Override
	public List<String> selectSchoolAll() {
		// TODO Auto-generated method stub
		return store.searchSchoolAll();
	}

	@Override
	public List<String> selectDepartmentBySchool(String school) {
		// TODO Auto-generated method stub
		return store.searchDepartmentBySchool(school);
	}

	@Override
	public List<String> selectDivisionBySchool(String school) {
		// TODO Auto-generated method stub
		return store.searchDivisionBySchool(school);
	}

	@Override
	public List<Lecture> selectLectureList(String school, String department, int year, String division,
			String lectureName) {
		// TODO Auto-generated method stub
		return store.searchLecturelist(school, department, year, division, lectureName);
	}

	@Override
	public Lecture selectLectureDetail(int lectureId) {
		// TODO Auto-generated method stub
		return store.searchLectureDetail(lectureId);
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
