package model;
// Type your code

import java.time.LocalDate;
public class Blog{
	
	private String title;
	private int description;
	private LocalDate postedOn;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	public Blog(String title, int description, LocalDate postedOn) {
		
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	
	
	
}