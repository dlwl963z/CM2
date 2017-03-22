package cm.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cm.domain.Building;
import cm.domain.ClassTime;
import cm.domain.Lecture;
import cm.domain.Professor;
import cm.store.facade.ManageLectureStore;
import cm.store.mapper.ManageLectureMapper;

public class ManageLectureStoreLogic implements ManageLectureStore{
	
	private SqlSessionFactory factory;
	public ManageLectureStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public List<String> searchSchoolAll() {
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchSchoolAll();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<String> searchDepartmentBySchool(String school) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchDepartmentBySchool(school);
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<String> searchDivisionBySchool(String school) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchDivisionBySchool(school);
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<Lecture> searchLecturelist(String school, String department, int year, String division,
			String lectureName) {
		SqlSession session = factory.openSession();
		List<Lecture> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchLecturelist(school, department, year, division, lectureName);
		}finally {
			session.close();
		}
		return list;
		
		
		
	}

	@Override
	public Lecture searchLectureDetail(int lectureId) {
		SqlSession session = factory.openSession();
		Lecture lecture = new Lecture();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			lecture = mapper.searchLectureDetail(lectureId);
		}finally {
			session.close();
		}
		return lecture;
	}


	@Override
	public List<Building> searchBuildings(int lectureId) {
		SqlSession session = factory.openSession();
		List<Building> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchBuildings(lectureId);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public Professor searchProfessor(int professorId) {
		SqlSession session = factory.openSession();
		Professor professor = new Professor();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			professor = mapper.searchProfessor(professorId);
		}finally{
			session.close();
		}
		return professor;
	}

	@Override
	public Boolean insertLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lecture> searchLectureByProfessorId(int professorId) {
		SqlSession session = factory.openSession();
		List<Lecture> list = null;
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			list = mapper.searchLectureByProfessorId(professorId);
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public ClassTime searchClassTimeBylectureId(int lectureId) {
		SqlSession session = factory.openSession();
		ClassTime classTime = new ClassTime();
		try{
			ManageLectureMapper mapper = session.getMapper(ManageLectureMapper.class);
			classTime = mapper.searchClassTimeBylectureId(lectureId);
		}finally{
			session.close();
		}
		return classTime;
	}
	

}
