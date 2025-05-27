package com.example.Student_Management.Controller;

import com.example.Student_Management.Model.Student;
import com.example.Student_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students") // base path
public class StudentManagementController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestParam String name,
                             @RequestParam String email,
                             @RequestParam String course) {
        studentService.save(name, email, course); // Call service method
        return "Student added";
    }
    @GetMapping("/get")
    public List<Student> getAllStudents() {
        return studentService.getStudent(); // fetch all students
    }
    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id); // Calls service to fetch by ID
    }
    @PutMapping("/insert/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudentById(id, updatedStudent);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        return studentService.deleteBid(id);
    }
}
