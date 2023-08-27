package cuz.gpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Score {
    private String sid;
    private String cid;
    private double score;
}
