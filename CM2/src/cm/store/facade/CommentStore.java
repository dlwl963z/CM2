package cm.store.facade;

import java.util.List;

import cm.domain.Comment;

public interface CommentStore {
	
	void insertComment(String userId, int lectureId,Comment comment);

	List<Comment> searchCommentList(int lectureId);
	
	Boolean modifyComment(String userId,Comment comment);
	
	Boolean deleteComment(String userId,Comment comment);
}
