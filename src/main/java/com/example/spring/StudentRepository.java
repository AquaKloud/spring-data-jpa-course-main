package com.example.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

