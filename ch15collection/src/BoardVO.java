
public class BoardVO {
	
	private long no;
	private String title, content, writer, writeDate;
	private long hit;
	private String pw;
	
	public long getNo() {return no;}
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public String getWriter() {return writer;}
	public String getWriteDate() {return writeDate;}
	public long getHit() {return hit;}
	public String getPw() {return pw;}
	
	public void setNo(long no) { this.no = no; }
	public void setTitle(String title) { this.title = title;}
	public void setContent(String content) { this.content = content;}
	public void setWriter(String writer) { this.writer = writer;}
	public void setWriteDate(String writeDate) { this.writeDate = writeDate;}
	public void setHit(long hit) { this.hit = hit; }
	public void setPw(String pw) { this.pw = pw;}
	
	public String toString() {
		return "BoardVO [ " + "no = " + no + ", +title = " + title + ", content = " + content
				+ ", writer = " + writer + ", writeDate = " + writeDate + ", hit = " + hit + ", pw = " + pw +" ]";
	}
	
}
