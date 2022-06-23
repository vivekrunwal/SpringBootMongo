package com.vivek.springmongo.Repo;

import com.vivek.springmongo.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,Integer> {


}
