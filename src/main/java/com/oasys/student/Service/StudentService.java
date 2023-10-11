package com.oasys.student.Service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.oasys.student.Dao.StudentDao;
import com.oasys.student.Entity.Student;
import com.oasys.student.Exception.AgeNotFoundException;

@Service
public class StudentService {
@Autowired
StudentDao stuDao;
public String insertStudent(Student a) {
	return stuDao.insertStudent(a);
}
public List<Student> insertStudent(List<Student> a) {
	
	return stuDao.insertStudent(a);
	
	}
public Student find(int c) {
	return stuDao.find(c);
}
public List<Student>findAlls() {
	return stuDao.findAlls();
}
public String deletedId(@PathVariable int s) {
	return stuDao.deletedId(s);
}
public List<Student> getStuByage(int age) {
	return stuDao.getStuByage(age);
}
public List<Student> getStuByname(String name) {
	List<Student> allEmp = this.findAlls();
	return allEmp.stream().filter(x -> x.getName().equalsIgnoreCase(name)).toList();
}
public List<Student> getByName(String name) {

	return stuDao.getByName(name);
}
//------------------------------------------------------------------------------------------------------------------------------------
public List<Student> getByAge(int age) throws AgeNotFoundException {
	List<Student> allEmp = this.findAlls();
	List<Student>val=allEmp.stream().filter(x -> x.getAge()>=age).toList();
	if(val.isEmpty()==true) {
		throw new AgeNotFoundException(".....There Is No Data In This Age....");
	}
	else {
	return val;
}
}
}


