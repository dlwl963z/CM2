package cm.store.facade;

import java.util.List;

import cm.domain.Building;
import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureStore {
	
	List<String> searchSchoolAll();
	
	List<String> searchDepartmentBySchool(String school);
	
	List<String> searchDivisionBySchool(String school);
	
	List<Lecture> searchLecturelist(String school, String department, int year, String division,
			String lectureName);
	
	Lecture searchLectureDetail(int lectureId);
	//함
	List<Building> searchBuildings(int lectureId);
	//함
	Professor searchProfessor(int professorId);
	
	Boolean insertLecture(Lecture lecture);
	
	Boolean modifyLecture(Lecture lecture);
	
	Boolean deleteLecture(int lectureId);
	
	List<Lecture> searchLectureByProfessorId(int professorId);
	//함
	ClassTime searchClassTimeBylectureId(int lectureId);
}
