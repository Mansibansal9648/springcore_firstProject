package com.springcore.life_cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        System.out.println("Setting price of pepsi");
        this.price=price;
    }
    public Pepsi(){
        super();
    }
    public String toString(){
        return "Pepsi [ price = "+price+ " ]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
// init method
       System.out.println("taking pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
//destroy
        System.out.println("Going to bottle back to shop : destroy");
    }
}
