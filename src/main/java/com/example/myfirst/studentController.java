package com.example.myfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentController {

    private final studentService stdService;

    @Autowired
    public studentController(studentService stdService) {
        this.stdService = stdService;
    }

    @GetMapping
    public List<student> getAllStudents() {
        return stdService.getAllUsers();
    }

    @GetMapping("/{id}")
    public student getStudentById(@PathVariable int id) {
        return stdService.getUserById(id);
    }

    @PostMapping
    public student createStudent(@RequestBody student std) {
        return stdService.saveUser(std);
    }

    @PutMapping("/{id}")
    public student updateStudent(@PathVariable int id, @RequestBody student std) {
        student existingStudent = stdService.getUserById(id);
        if (existingStudent != null) {
            existingStudent.setName(std.getName());
            existingStudent.setEmail(std.getEmail());
            existingStudent.setPassword(std.getPassword());
            return stdService.saveUser(existingStudent);
        } else {
            return null; // Handle the case when the student doesn't exist
        }
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        stdService.deleteUser(id);
    }
}
