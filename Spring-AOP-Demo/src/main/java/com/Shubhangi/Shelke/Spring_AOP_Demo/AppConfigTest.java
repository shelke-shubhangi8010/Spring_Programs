package com.Shubhangi.Shelke.Spring_AOP_Demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.Shubhangi.Shelke")
@EnableAspectJAutoProxy
public class AppConfigTest {

}
