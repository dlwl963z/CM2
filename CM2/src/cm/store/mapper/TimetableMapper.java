package cm.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cm.domain.Lecture;
import cm.domain.Timetable;

public interface TimetableMapper {
	
	Boolean insertLectureTimetable(@Param("timeId2") int timeId, @Param("list2") List<Lecture> list);
	// 강의를 시간표에 넣음(넣을 시간표의 아이디를 받아 그 시간표에 강의들을 넣음) 
	// 1. lecture의 아이디가 DB안에 존재해야함 (강의아이디를 넣을때 열린강의 테이블에서  
	List<Lecture> searchLectureTimetable(int timeId);
	// 시간표의 강의들을 출력
	Boolean deleteLectureTimetable(@Param("timeId") int timeId, @Param("list") List<Lecture> list);
	// 시간표에 있는 강의들을 삭제함
	Boolean deleteTimetable(int timeId);
	// 시간표를 삭제함
	Boolean createTimetable(@Param("userId") String userId,@Param("timetable") Timetable timetable);
	// 시간표를 만듦
	Timetable searchTimetable(String userId);
	// 유저를 찾고 시간표를 추출함
}