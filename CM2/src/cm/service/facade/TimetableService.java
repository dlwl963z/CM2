package cm.service.facade;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;

public interface TimetableService {
	
	Boolean createLectureTimetable(int timeId, List<Lecture> list);
	
	List<Lecture> selectLectureTimetable(int timeId);
	
	Boolean removeLectureTimetable(int timeId,List<Lecture> list);
	
	Boolean removeTimetable(int timeId);
	
	Boolean createTimetable(String userId,Timetable time);
	
	Timetable selectTimetable(String userId);

}
