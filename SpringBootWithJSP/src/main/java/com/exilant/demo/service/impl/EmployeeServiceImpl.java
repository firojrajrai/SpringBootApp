package com.exilant.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exilant.demo.dao.EmployeeDAO;
import com.exilant.demo.service.EmployeeService;
import com.exilant.demo.to.EmployeeTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO edao;
	
	@Transactional
	@Override
	public void addEmployee(EmployeeTO eto) {
		edao.addEmployee(eto);

	}

}
