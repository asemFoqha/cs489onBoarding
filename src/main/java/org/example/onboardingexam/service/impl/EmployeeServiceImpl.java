package org.example.onboardingexam.service.impl;


import lombok.AllArgsConstructor;
import org.example.onboardingexam.entity.Employee;
import org.example.onboardingexam.repository.EmployeeRepository;
import org.example.onboardingexam.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor()
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

}
