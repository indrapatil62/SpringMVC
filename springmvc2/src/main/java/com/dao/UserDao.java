package com.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Student;

//it is a data acess layer
@Repository
public class UserDao {
  @Autowired
  HibernateTemplate hibernateTemplate;

  @Transactional
  public int saveUser(Student student) {

    int id = (Integer) this.hibernateTemplate.save(student);
    return id;
  }
}