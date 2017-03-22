package cm.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Lecture;
import cm.domain.Timetable;
import cm.store.facade.TimetableStore;
import cm.store.mapper.TimetableMapper;

public class TimetableStoreLogic implements TimetableStore{

	private SqlSessionFactory factory; 
	
	public TimetableStoreLogic(){
		
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
		
	}
	
	public Boolean insertLectureTimetable(int tiemId, List<Lecture> list) {

		SqlSession session = null;
		
		try{
			
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			
			if(mapper.insertLectureTimetable(tiemId, list))
				return true;
		}finally{
			session.close();
		}
		return false;
	}

	public List<Lecture> searchLectureTimetable(int timeId) {

		SqlSession session = null;
		try{
			
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			
			return mapper.searchLectureTimetable(timeId);
			
		}finally{
			session.close();
		}
	}

	public Boolean deleteLectureTimetable(int timeId, List<Lecture> list) {
		
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);

			if(mapper.deleteLectureTimetable(timeId, list)){
				return true;
			}
		}finally{
			session.close();
		}
		return false;
	}

	public Boolean deleteTimetable(int timeId) {
		
		SqlSession session = null;
		
	
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
		if(mapper.deleteTimetable(timeId)){
			return true;
		}
		}finally{
			session.close();
		}
		return false;
	}

	public Boolean createTimetable(String userId, Timetable timetable) {

		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
			if(mapper.createTimetable(userId, timetable)){
				return true;
			}
		}finally{
			session.close();
		}
		return false;
	}

	public Timetable searchTimetable(String userId) {
		
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			TimetableMapper mapper = session.getMapper(TimetableMapper.class);
	
			return mapper.searchTimetable(userId);
		
		}finally{
			session.close();
		}
	}

}
