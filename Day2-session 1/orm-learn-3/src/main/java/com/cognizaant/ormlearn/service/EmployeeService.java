package com.cognizaant.ormlearn.service;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizaant.ormlearn.model.Employee;
import com.cognizaant.ormlearn.repository.EmployeeRepository;
import com.cognizant.ormlearn.OrmLearn3Application;



@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;
  
  private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearn3Application.class);
  
  @Transactional
  public Employee get(int id) {

	  LOGGER.info("Start");
	  Optional<Employee> e=employeeRepository.findById(id);
	  Employee e1=e.get();
	  return e1;
  }
  
  @Transactional
  public void saveEmployee(Employee employee) {
	  LOGGER.info("Start");
	  employeeRepository.save(employee);
	  LOGGER.info("End");

  }
  
}