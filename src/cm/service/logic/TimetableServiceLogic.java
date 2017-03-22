package cm.service.logic;

import java.util.List;

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.service.facade.TimetableService;
import cm.store.facade.TimetableStore;
import cm.store.logic.TimetableStoreLogic;

public class TimetableServiceLogic implements TimetableService{
	
	TimetableStore store = null;
	
	public TimetableServiceLogic(){
		
		store = new TimetableStoreLogic();
	}
	
	public Boolean createLectureTimetable(int timeId, List<Lecture> list) {
		
		return store.insertLectureTimetable(timeId, list);
	}

	public List<Lecture> selectLectureTimetable(int timeId) {
		return store.searchLectureTimetable(timeId);
	}

	public Boolean removeLectureTimetable(int timeId, List<Lecture> list) {
		return store.deleteLectureTimetable(timeId, list);
	}

	public Boolean removeTimetable(int timeId) {
		return store.deleteTimetable(timeId);
	}

	public Boolean createTimetable(String userId, Timetable time) {
		return store.createTimetable(userId, time);
	}

	public Timetable selectTimetable(String userId) {
		return store.searchTimetable(userId);
	}

}
