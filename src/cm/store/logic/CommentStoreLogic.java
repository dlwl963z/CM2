package cm.store.logic;

import java.util.List;

import cm.domain.Comment;
import cm.store.facade.CommentStore;

public class CommentStoreLogic implements CommentStore{

	@Override
	public void insertComment(String userId, int lectureId, Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> searchCommentList(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyComment(String userId, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteComment(String userId, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

}
