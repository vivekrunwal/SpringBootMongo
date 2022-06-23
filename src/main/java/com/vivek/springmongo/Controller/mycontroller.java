package com.vivek.springmongo.Controller;

import com.vivek.springmongo.Model.Student;
import com.vivek.springmongo.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class mycontroller {



    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){

       Student save =  this.studentRepo.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent(){

//        Student save =  this.studentRepo.save(student);
        return ResponseEntity.ok(this.studentRepo.findAll());
    }


}
