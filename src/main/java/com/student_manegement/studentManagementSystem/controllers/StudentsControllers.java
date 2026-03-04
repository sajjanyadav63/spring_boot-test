package com.student_manegement.studentManagementSystem.controllers;

import com.student_manegement.studentManagementSystem.entity.Students;
import com.student_manegement.studentManagementSystem.services.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("studentsTable1")
public class StudentsControllers {
    @Autowired
    private StudentsServices s;

    @GetMapping("getAllStudents")
    public List<Students> getAllStudents(){
        return s.get_all_students();
    }
    @PostMapping("postStudent")
    public Students postStudent(@RequestBody Students stu1){
        return s.post_student(stu1);
    }
    @DeleteMapping("deleteStudentById/{i}")
    public String deleteStudentById(@PathVariable Long i){
        s.delete_student_by_id(i);
        return "Deleted Successfully ...";
    }

}
