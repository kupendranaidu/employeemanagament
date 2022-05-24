package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.employee;

@Repository
public interface employeerepository extends JpaRepository<employee,Long> {

}
