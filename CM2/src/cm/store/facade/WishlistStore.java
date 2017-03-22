package cm.store.facade;

import java.util.List;

import cm.domain.Lecture;

public interface WishlistStore {
	
	Lecture searchLectureWishlist(String userId,String lectureId);
	
	Boolean deleteLectureWishlist(String userId,String lectureId);
	
	Boolean deleteLectureAllWishlist(String userId);
	
	List<Lecture> searchLectureAllWishlist(String userId);
	
	Boolean insertLectureWishlist(String userId,List<Lecture> list);
	
}
