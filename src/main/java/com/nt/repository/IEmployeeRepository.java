package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Empoloyee;


public interface IEmployeeRepository extends JpaRepository<Empoloyee,Integer>
{

}
