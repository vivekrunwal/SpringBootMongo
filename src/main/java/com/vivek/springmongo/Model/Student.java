package com.vivek.springmongo.Model;


import com.mongodb.client.model.Collation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="students")
public class Student {

    private int id;
    private String name;
    private String city;
    private String college;

}
