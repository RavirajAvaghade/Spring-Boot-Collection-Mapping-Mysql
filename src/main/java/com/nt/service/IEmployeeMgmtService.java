package com.nt.service;

import java.util.List;

import com.nt.entity.Empoloyee;

public interface IEmployeeMgmtService 
{ 
  public List<Empoloyee> ShowAllEmployees();
  public String registerEmployee(Empoloyee emp);
}
