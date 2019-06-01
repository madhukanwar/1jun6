package com.example.Pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	public SchoolDao schoolDao;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}


	@RequestMapping("/{name}")
	public List<Schooldemo> getName(@PathVariable String name)throws
			InterruptedException, ExecutionException, TimeoutException {
		return schoolDao.findByName(name,new PageRequest(1,4, Sort.Direction.ASC,"name"));
		}

}
