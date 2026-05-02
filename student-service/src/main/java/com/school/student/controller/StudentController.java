package com.school.student.controller;

import com.school.student.entity.Student;
import com.school.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private  final StudentService studentService;

    @PostMapping
    public Student createNewStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getAllStudentDetails(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentDetail(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void deletStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }
}
