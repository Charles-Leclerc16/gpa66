package cuz.gpa.Controller;

import com.google.gson.Gson;
import cuz.gpa.mapper.ScoreMapper;
import cuz.gpa.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController

public class ScoreController {
    @Autowired
    private ScoreMapper scoreMapper;
    private Gson gson = new Gson();
    @GetMapping("/score")
    public String getStudentList(){
        List<Score> scoreList =  scoreMapper.selectList(null);
        return gson.toJson(scoreList);

    }
}
