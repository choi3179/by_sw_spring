package com.by.spring.ex05;

import lombok.Data;

@Data
public class MyInformation {
    private Person person;  // Has-A

    public boolean processMessage(StudentPersonImpl student){
        return this.person.personShow(student.getName(), student.getAge(), student.getGender());
    }

    public boolean processMessage(EmployeePersonImpl emp){
        return this.person.personShow(emp.getName(), emp.getAge(), emp.getGender());
    }

    public boolean processMessage(String name, int age, String gender){
        return this.person.personShow(name, age, gender);
    }
}
