package com.example.myfirst;

import org.springframework.data.repository.CrudRepository;


public interface studentRepo extends CrudRepository<student, Long> {

}
