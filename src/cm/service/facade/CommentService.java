package cm.service.facade;

import java.util.List;

import cm.domain.Comment;

public interface CommentService {
	
	void createComment(String userId,int lectureId,Comment commnet);
	
	List<Comment> selectCommentList(int lectureId);
	
	Boolean updateComment(String userId,Comment comment);
	
	Boolean removeComment(String userId,Comment comment);

}
