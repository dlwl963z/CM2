package cm.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cm.domain.Lecture;
import cm.domain.Timetable;

public interface TimetableMapper {
	
	Boolean insertLectureTimetable(@Param("timeId2") int timeId, @Param("list2") List<Lecture> list);
	// ���Ǹ� �ð�ǥ�� ����(���� �ð�ǥ�� ���̵� �޾� �� �ð�ǥ�� ���ǵ��� ����) 
	// 1. lecture�� ���̵� DB�ȿ� �����ؾ��� (���Ǿ��̵� ������ �������� ���̺���  
	List<Lecture> searchLectureTimetable(int timeId);
	// �ð�ǥ�� ���ǵ��� ���
	Boolean deleteLectureTimetable(@Param("timeId") int timeId, @Param("list") List<Lecture> list);
	// �ð�ǥ�� �ִ� ���ǵ��� ������
	Boolean deleteTimetable(int timeId);
	// �ð�ǥ�� ������
	Boolean createTimetable(@Param("userId") String userId,@Param("timetable") Timetable timetable);
	// �ð�ǥ�� ����
	Timetable searchTimetable(String userId);
	// ������ ã�� �ð�ǥ�� ������
}