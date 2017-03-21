package cm.service.logic;

import java.util.List;

import cm.domain.Comment;
import cm.service.facade.CommentService;

public class CommentServiceLogic implements CommentService{

	@Override
	public void createComment(String userId, int lectureId, Comment commnet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> selectCommentList(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateComment(String userId, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeComment(String userId, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

}
