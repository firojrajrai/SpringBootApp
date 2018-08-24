package com.exilant.demo.dao.impl;


import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.exilant.demo.dao.EmployeeDAO;
import com.exilant.demo.model.Employee;
import com.exilant.demo.to.EmployeeTO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	org.springframework.orm.hibernate4.HibernateTemplate htemp;
	
	public void addEmployee(EmployeeTO eto) {
	Employee emp = new Employee(eto.getName(),eto.getAge(),eto.getPhone(),eto.getGender(),eto.getDesignation(),eto.getUsername(),eto.getPassword());
	htemp.save(emp);	
		
}
}
