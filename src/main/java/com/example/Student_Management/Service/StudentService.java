package com.example.Student_Management.Service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.Student_Management.Model.Student;
import com.example.Student_Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository sturepo;

    public void save(String name,String email,String course){
        Student user= new Student(name,email,course);
        sturepo.save(user);
        System.out.println("Name: "+name+" Email: "+email+" Course: "+course);
    }
    public List<Student> getStudent(){
        return sturepo.findAll();
    }

    public Student getStudentById(Long id) {
        return sturepo.findById(id).orElse(null);
    }

    public String updateStudentById(Long id, Student updatedStudent){
        Student find= sturepo.findById(id).orElse(null);
        if(find!=null){
          find.setName(updatedStudent.getName());
          find.setEmail(updatedStudent.getEmail());
          find.setCourse(updatedStudent.getCourse());
          sturepo.save(find);
          return "Exiting student updated";
        }else{
            return "Student not Found";
        }
    }

    public String deleteBid(Long id){
        if(sturepo.existsById(id)){
            sturepo.deleteById(id);
            return "Deleted successfully";
        }else{
            return "Records not Found";
        }
        

    }
}
