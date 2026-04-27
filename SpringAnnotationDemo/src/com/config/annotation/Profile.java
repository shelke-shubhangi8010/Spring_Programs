package com.config.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Profile {
    @Value("shubhangi Shelke")
	private String title;
    
    @Value("Software Developer")
	private String position;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", position=" + position + "]";
	}

}
