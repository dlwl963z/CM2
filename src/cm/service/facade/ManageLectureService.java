package cm.service.facade;

import java.util.List;

import cm.domain.Building;
import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureService {
	
	List<String> selectSchoolAll();

	List<String> selectDepartmentBySchool(String school);
	
	List<String> selectDivisionBySchool(String school);
	
	List<Lecture> selectLectureList(String school,String department,int year,String division,String lectureName);
	
	List<String> selectLectureDetail(int lectureId);
	
	List<Building> selectBuildings(int lectureId);
	
	Professor selectProfessor(int professorId);
	
	Boolean createLecture(Lecture lecture);
	
	Boolean updateLecture(Lecture lecture);
	
	Boolean removeLecture(int lectureId);
	
	List<Lecture> selectLectureByProfessorId(int professorId);
	
	ClassTime selectClassTimeBylectureId(int lectureId);
}
