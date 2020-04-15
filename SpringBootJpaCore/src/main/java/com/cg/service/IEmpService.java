package com.cg.service;

import java.util.List;

import com.cg.entity.Dept;
import com.cg.entity.Emp;

public interface IEmpService {

	
	List<Dept> getDepts();
	void addEmployee(Emp emp);
	List<Emp> viewAllEmp();
	Emp getEmpById(int eid);
	boolean deleteEmp(int eid);
}
