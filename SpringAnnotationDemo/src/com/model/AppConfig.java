package com.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//  it will configure of class not need xml file
// this u xml file without using xml file
/// it create  xml  file internally
@Configuration


// scan the all pogo/bean class
// convert all pogo classes into bean form
@ComponentScan(basePackages = "com.model")
public class AppConfig {

	
	
	
}
