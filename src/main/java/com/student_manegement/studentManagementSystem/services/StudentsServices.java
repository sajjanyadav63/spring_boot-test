package com.student_manegement.studentManagementSystem.services;

import com.student_manegement.studentManagementSystem.entity.Students;
import com.student_manegement.studentManagementSystem.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentsServices {
    @Autowired
    private StudentsRepository r;

    public List<Students> get_all_students(){
        return r.findAll();
    }
    public Students post_student(Students s1) {
        return r.save(s1);
    }
    public void delete_student_by_id(Long l){
        r.deleteById(l);
    }
//    public void put_student(Long l3){
//        r.save();
//    }
}
