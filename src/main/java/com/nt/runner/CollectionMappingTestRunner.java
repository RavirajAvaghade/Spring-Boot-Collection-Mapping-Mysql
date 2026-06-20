package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Empoloyee;
import com.nt.service.IEmployeeMgmtService;
@Component
public class CollectionMappingTestRunner implements CommandLineRunner
{
	@Autowired
    private IEmployeeMgmtService employee;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		try
		{
			List<String> friendsList =List.of("rajesh1","suresh1","mahesh1");
			Set<String> PhoneList  = Set.of("9876543210L","838393939L","3232443L","783838339L");
			Map<String,String> IDdetails = Map.of("Aadhar","92939399","passport","647743838");
			Empoloyee emp = new Empoloyee(null, "mahesj","hyd1",friendsList,PhoneList,IDdetails);
		
			String msg = employee.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
