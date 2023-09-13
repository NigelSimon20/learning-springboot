package com.nigel.springboot.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> RetreiveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn Node", "Nigel Simon"),
                new Course(2,"Learn Java","Nigel Simon")
        );
    }

}
