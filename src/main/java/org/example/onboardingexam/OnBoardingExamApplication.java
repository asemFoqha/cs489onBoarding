package org.example.onboardingexam;

import org.example.onboardingexam.entity.Employee;
import org.example.onboardingexam.service.EmployeeService;
import org.example.onboardingexam.service.impl.EmployeeServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnBoardingExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnBoardingExamApplication.class, args);


    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeServiceImpl employeeServiceImpl) {
        return args -> {
            Employee john = new Employee();
            john.setFirstName("John");
            john.setLastName("Doe");
            john.setSalary(50000);

            employeeServiceImpl.add(john);

            Employee jane = new Employee();
            jane.setFirstName("Jane");
            jane.setLastName("Dona");
            jane.setSalary(50000);

            employeeServiceImpl.add(jane);

            Employee alice = new Employee();
            alice.setFirstName("Alice");
            alice.setLastName("Smith");
            alice.setSalary(60000);

            employeeServiceImpl.add(alice);

            Employee bob = new Employee();
            bob.setFirstName("Bob");
            bob.setLastName("Brown");
            bob.setSalary(45000);

            employeeServiceImpl.add(bob);
        };
    }

}
