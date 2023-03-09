package com.springcore.auto_wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("auto_wire_annotation_config.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

    }
}
