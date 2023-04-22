package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.Student;

@Service
public class StudentService {

@Autowired
UserDao userDao;


public int createStudent(Student student) {
	return userDao.saveUser(student);
}




}