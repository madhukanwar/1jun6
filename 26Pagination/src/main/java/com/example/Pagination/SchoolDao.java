package com.example.Pagination;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolDao extends JpaRepository<Schooldemo,Integer> {

    List<Schooldemo> findByName(String name,Pageable pageable);
}
