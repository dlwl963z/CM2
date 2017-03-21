package cm.store.mapper;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;

public interface TimetableMapper {
	
	Boolean insertLectureTimetable(int timeId,List<Lecture> list);

	List<Lecture> searchLectureTimetable(int timeId);
	
	Boolean deleteLectureTimetable(int timeId,List<Lecture> list);

	Boolean deleteTimetable(int timeId);
	
	Boolean createTimetable(String userId,Timetable timetable);
	
	Timetable searchTimetable(String userId);

}
