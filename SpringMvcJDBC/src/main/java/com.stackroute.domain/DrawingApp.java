package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {
    public static void main(String[] args) {

        //using normal function using new()
//         Triangle triangle = new Triangle();
//         triangle.draw();

        //with Bean factory pattern
//        BeanFactory factory  = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        Triangle triangle = (Triangle) factory.getBean("triangle");
//        triangle.draw();


        //with Application Context pattern
         //ApplicationContext context = new ClassPathXmlApplicationContext("../spring.xml");
           ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
           Triangle triangle = (Triangle) context.getBean("triangle");
           triangle.draw();
    }

}
