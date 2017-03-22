package cm.store.mapper;

import java.util.List;

import cm.domain.Building;
import cm.domain.Lecture;
import cm.domain.Professor;

public interface ManageLectureMapper {
	
	List<String> searchSchoolAll();
	
	List<String> searchDepartmentBySchool(String school);
	
	List<String> searchDivisionBySchool(String school);
	
	List<Lecture> searchLecturelist(String school,String department,int year,String division,String lectureName);
	
	Lecture searchLectureDetail(int lectureId);
	
	Building searchBuilding(int lectureId);
	
	Professor searchProfessor(int professorId);
	
	Boolean insertLecture(Lecture lecture);
	
	Boolean modifyLecture(Lecture lecture);
	
	Boolean deleteLecture(int lectureId);
	
	List<Lecture> searchLectureByLectureId(int professorId);

}
