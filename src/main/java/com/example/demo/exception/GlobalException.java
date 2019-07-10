package com.example.demo.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

//@ControllerAdvice
@Configuration
public class GlobalException {
	/*@ExceptionHandler(value={java.lang.ArithmeticException.class})	//将异常的名字复制进来
	public ModelAndView arithmeticExceptionHandler(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.toString());	//将异常对象用字符串的形式表现出来e.toString
		mv.setViewName("error1");	//跳转到error1的视图
		return mv;
	}
	@ExceptionHandler(value={java.lang.NullPointerException.class})	//将异常的名字复制进来
	public ModelAndView nullPointerExceptionHandler(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.toString());	//将异常对象用字符串的形式表现出来e.toString
		mv.setViewName("error1");	//跳转到error1的视图
		return mv;
	}*/
	
	
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
	SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
	Properties mappings = new Properties();
	mappings.put("java.lang.ArithmeticException","error1");		//参数一：异常的类型，注意必须是异常类的全名
	mappings.put("java.lang.NullPointerException","error1");	//参数二：视图名	
	resolver.setExceptionMappings(mappings);
	return resolver;
	}
}
