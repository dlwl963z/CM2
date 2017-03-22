package cm.store.facade;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;

public interface TimetableStore {
	
	Boolean insertLectureTimetable(int timeId, List<Lecture> list);

	List<Lecture> searchLectureTimetable(int timeId);
	
	Boolean deleteLectureTimetable(int timeId,List<Lecture> list);

	Boolean deleteTimetable(int timeId);
	
	Boolean createTimetable(String userId,Timetable timetable);
	
	Timetable searchTimetable(String userId);
	
	
}
