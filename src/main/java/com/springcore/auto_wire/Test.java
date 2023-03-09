package com.springcore.auto_wire;

import com.springcore.life_cycle.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("auto_wire_config.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

    }
}
