package cm.service.logic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cm.service.facade.ManageLectureService;

public class ManageLectureServiceLogicTest {
	private ManageLectureService service;
	@Before
	public void setUp() {
		service = new ManageLectureServiceLogic();
	}

	@Test
	public void testSelectSchoolAll() {
		List<String> list = new ArrayList<>();
		list = service.selectSchoolAll();
		
	}

//	@Test
//	public void testSelectDepartmentBySchool() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectDivisionBySchool() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectLectureList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectLectureDetail() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectBuildings() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectProfessor() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateLecture() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateLecture() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveLecture() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectLectureByProfessorId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectClassTimeBylectureId() {
//		fail("Not yet implemented");
//	}

}
