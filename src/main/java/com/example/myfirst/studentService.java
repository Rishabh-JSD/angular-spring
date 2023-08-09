package com.example.myfirst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
	
private final studentRepo stdRep;

@Autowired
public studentService(studentRepo stdRep) {
	this.stdRep=stdRep;
}
	
public List<student> getAllUsers(){
	return(List<student>)
			student.findAll();
}

public student getUserById(int id) {
	return stdRep.findById((long) id).orElse(null);
}

public student saveUser(student std) {
	return stdRep.save(std);
}
public void deleteUser(int id) {
	stdRep.deleteById((long) id);
}
}
