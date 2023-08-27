package cuz.gpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private  String id;
    private  String name;
    private double credit;
}
