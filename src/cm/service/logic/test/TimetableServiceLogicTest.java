package cm.service.logic.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cm.domain.Lecture;
import cm.service.facade.TimetableService;
import cm.service.logic.TimetableServiceLogic;

public class TimetableServiceLogicTest {
	TimetableService service = null;
	@Before
	public void setUp(){
		service = new TimetableServiceLogic();
		
	}

	@Test
	public void testCreateLectureTimetable() {
		List<Lecture> lecture = new ArrayList<Lecture>();
//		Lecture lec = new Lecture();
//		lec.setId(1);
//		lec.setName("2");
//		lec.setCredit(2);
//		lec.setSchool("2");
//		lec.setDepartment("2");
//		lec.setDivision("2");
//		lec.setGrade(2);
		
		lecture = service.selectLectureTimetable(1);
		System.out.println(lecture.get(0).getId());
//		lecture.add(lec);
		
		assertEquals(true, 	service.createLectureTimetable(3, lecture));
		
	}

//	@Test
//	public void testSelectLectureTimetable() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveLectureTimetable() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveTimetable() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateTimetable() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectTimetable() {
//		fail("Not yet implemented");
//	}

}
