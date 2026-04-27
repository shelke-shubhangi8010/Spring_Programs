package com.config.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("instructor") // this is define name of bean with  the help of  @component

@Scope("prototype") // it will allow to the change of the hashcode

public class Instructor {
  // @Value("#{100+20}") // expression language
  // @Value("100")
	
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int id=10001;
   
   //@Value("ram")
	@Value("#{new java.lang.String('Raj')}")
	private String name;

   @Value("#{topics}")
   private List<String>topics;
   
   @Autowired   // if inject  the reference type of element
               // inject the data one class into another one class
   private Profile profile;
   
   @Value("#{(2+4>5)}")
   private boolean Active;
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", Active="
				+ Active + "]";
	}

	

	

	

}
