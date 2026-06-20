package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Empoloyee;
import com.nt.repository.IEmployeeRepository;

@Service
public class IEmployeeMgmtServiceimp implements IEmployeeMgmtService 
{
	@Autowired
	private IEmployeeRepository repo;

	public String registerEmployee(Empoloyee emp) 
	{
	    Empoloyee savedEmp = repo.save(emp);
	    return "Employee value is saved with id value :" + savedEmp.getEid();
	}

	public List<Empoloyee> ShowAllEmployees() 
	{
		return repo.findAll();
	}

}
