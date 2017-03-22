package cm.service.facade;

import java.util.List;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureService {
	
	List<String> selectSchoolAll();

	List<String> selectDepartmentBySchool(String school);
	
	List<String> selectDivisionBySchool(String school);
	
	List<Lecture> selectLectureList(String school,String department,int year,String division,String lectureName);
	
	Lecture selectLectureDetail(int lectureId);
	
	Building selectBuilding(int lectureId);
	
	Professor selectProfessor(int professorId);
	
	Boolean createLecture(Lecture lecture);
	
	Boolean updateLecture(Lecture lecture);
	
	Boolean removeLecture(int lectureId);
	
	List<Lecture> selectLectureByLectureId(int professorId);
	
	
}
