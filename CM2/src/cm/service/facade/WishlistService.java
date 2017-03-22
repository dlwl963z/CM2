package cm.service.facade;

import java.util.List;

import cm.domain.Lecture;

public interface WishlistService {
	
	Lecture selectLectureWishlist(String userId,String lectureId);

	Boolean removeLectureWishlist(String userId,String lectureId);
	
	Boolean removeLectureAllWishlist(String userId);
	
	List<Lecture> selectLectureAllWishlist(String userId);
	
	Boolean createLectureWishlist(String userId,List<Lecture> list);
}
