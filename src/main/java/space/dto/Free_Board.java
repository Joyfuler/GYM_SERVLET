package space.dto;

import java.sql.Timestamp;

public class Free_Board {
	private int idx;
	private String title;
	private String content;
	private Timestamp regist_date;
	private int views;
	private Member member;
	private int commentCnt;
	
	public Free_Board() {}	
	
	public Free_Board(int idx, String title, String content) {
		this.idx = idx;
		this.title = title;
		this.content = content;		
	}
	
	public Free_Board(String title, String content, int views, Member member) {				
		this.title = title;
		this.content = content;		
		this.views = views;
		this.member = member;
	}
	
	public Free_Board(int idx, String title, String content, Timestamp regist_date, int views, Member member) {	
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.regist_date = regist_date;
		this.views = views;
		this.member = member;
	}
	
	public Free_Board(int idx, String title, String content, Timestamp regist_date, int views, Member member,
			int commentCnt) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.regist_date = regist_date;
		this.views = views;
		this.member = member;
		this.commentCnt = commentCnt;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegist_date() {
		return regist_date;
	}
	public void setRegist_date(Timestamp regist_date) {
		this.regist_date = regist_date;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public int getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}

	@Override
	public String toString() {
		return "Free_Board [idx=" + idx + ", title=" + title + ", content=" + content + ", regist_date=" + regist_date
				+ ", views=" + views + ", member=" + member + "]";
	}
	
}
