package com.example.Student_Management.Repository;

import com.example.Student_Management.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
