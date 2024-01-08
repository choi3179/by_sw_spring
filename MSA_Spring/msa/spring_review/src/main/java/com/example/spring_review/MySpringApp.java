package com.example.spring_review;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Employee{
    private Address address;

    public Employee() {

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

@Component
class Address {
    private String loc;

    public Address() {

    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

@Configuration
@ComponentScan(basePackages = "com.example.spring_review")
class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public Address address() {
        return new Address();
    }
}
public class MySpringApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = ctx.getBean(Employee.class);
        Address address = ctx.getBean(Address.class);
        address.setLoc("서울");
        employee.setAddress(address);

        System.out.println(employee.getAddress().getLoc());
    }
}
