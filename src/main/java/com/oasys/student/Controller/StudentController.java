package com.oasys.student.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.student.Entity.Student;
import com.oasys.student.Exception.AgeNotFoundException;
import com.oasys.student.Service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
StudentService stuSer;
	@PostMapping(value="/add")
	public String insertStudent(@RequestBody Student a) {
		return stuSer.insertStudent(a);
	}
	@PostMapping(value ="/list")
	public List<Student> insertStudent(@RequestBody List<Student> a) {
		return stuSer.insertStudent(a);
	}
	@GetMapping(value ="/id/{c}")
	public Student find(@PathVariable int c) {
		return stuSer.find(c);
	}
	@GetMapping(value="/findAlls")
	public List<Student>findAlls() {
	return stuSer.findAlls();
}
	@GetMapping(value="/deleteId/{s}")
	public String deletedId(@PathVariable int s) {
		return stuSer.deletedId(s);
	}
	@GetMapping(value = "/getByAge/{age}")
	public List<Student> getStuByAge(@PathVariable int age) {
		return stuSer.getStuByage(age);
}
	@GetMapping(value = "/getByname/{name}")
	public List<Student> getByName(@PathVariable String name){
		return stuSer.getByName(name);
	}
	//---------------------------------------------------------------------------------------------------------
	@GetMapping(value="/getByAge/{age}")
	public List<Student>getByAge(@PathVariable int age) throws AgeNotFoundException  {
		return stuSer.getByAge(age);
	}
}
