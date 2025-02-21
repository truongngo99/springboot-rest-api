package asia.executionlab.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import asia.executionlab.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
