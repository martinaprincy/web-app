package com.oasys.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
@Query(value="select*from student where age>=?",nativeQuery=true)
	 public List<Student> getStuByage(int age);
@Query(value="select*from student where name like ?%",nativeQuery=true)
public List<Student> getByName(String name);

	
}
