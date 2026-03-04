package com.student_manegement.studentManagementSystem.repository;

import com.student_manegement.studentManagementSystem.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Long> {
}
