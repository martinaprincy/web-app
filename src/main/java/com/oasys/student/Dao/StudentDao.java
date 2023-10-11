package com.oasys.student.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.student.StudentRepository;
import com.oasys.student.Entity.Student;

@Repository
public class StudentDao {
@Autowired
StudentRepository stuRepo;
public String insertStudent(Student a) {
	stuRepo.save(a);
	return "sucess";
	
}
public List<Student> insertStudent (List<Student>a ){
	stuRepo.saveAll(a);
	return a;
}  
public Student find(int c) {
	return stuRepo.findById(c).get();
}
public List<Student>findAlls() {
	return stuRepo.findAll();
}
public String deletedId(int s) {
	stuRepo.deleteById(s);
	return "sucessfully deleted";
}
public List<Student> getStuByage(int age) {

	return stuRepo.getStuByage ( age);
}
public List<Student> getByName(String name) {

	return stuRepo.getByName(name);
}

}
