package com.example.myfirst;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
 public class student{
	@Id
    private String name;
    private String email;
    private int password;
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public int getPassword(){
    return password;
}
public void setPassword(int password){
    this.password=password;
}
public static List<student> findAll() {
	// TODO Auto-generated method stub
	return null;
}

}
