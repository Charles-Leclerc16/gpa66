package cuz.gpa.Controller;

import com.google.gson.Gson;
import cuz.gpa.mapper.CourseMapper;
import cuz.gpa.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController

public class CourseController {
    @Autowired
    private CourseMapper courseMapper;
    private Gson gson = new Gson();
    @GetMapping("/course")
    public String getStudentList(){
        List<Course> courseList =  courseMapper.selectList(null);
        return gson.toJson(courseList);

    }
}
