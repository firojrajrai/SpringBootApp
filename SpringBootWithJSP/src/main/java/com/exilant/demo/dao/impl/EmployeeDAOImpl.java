package com.exilant.demo.dao.impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate; 
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exilant.demo.dao.EmployeeDAO;
import com.exilant.demo.model.Employee;
import com.exilant.demo.to.EmployeeTO;
@Transactional
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	HibernateTemplate htemp;
	
	@Transactional(readOnly=false)
	public void addEmployee(EmployeeTO eto) {
	Employee emp = new Employee(eto.getName(),eto.getAge(),eto.getPhone(),eto.getGender(),eto.getDesignation(),eto.getUsername(),eto.getPassword());
	htemp.save(emp);	
		
}
}
