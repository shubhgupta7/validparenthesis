package com.Project.ValidParenthesis.controllers;

import com.Project.ValidParenthesis.model.result;
import com.Project.ValidParenthesis.model.stackInfo;
import com.Project.ValidParenthesis.repository.resultsRepo;
import com.Project.ValidParenthesis.repository.stackInfoRepo;
import com.Project.ValidParenthesis.services.stackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
public class homeControllers {

    @Autowired
    private stackService stack;
    @Autowired
    private resultsRepo result;

    @Autowired
    private stackInfoRepo stackRepo;

    @GetMapping("/getAll")
    public List<result> getAl(){
        return result.findAll();
    }
    @PostMapping("/valid")
    public String checkValid(@RequestBody String string) {
        Boolean ans = stackService.isValid(string);
        String update;
        if (ans) {
            update = "Valid";
        } else {
            update = "Not valid ";
        }
        stackInfo data = new stackInfo(string, update ,LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        String m = data.getResult();
        result.save(new result(data.getInputString()));
        stackRepo.save(data);
        return m;
    }

    @GetMapping("/getValue/{string}")
    public String getValue(@PathVariable String string) {
        Boolean ans = stackService.isValid(string);
        return ans ? "valid" : "not valid";
    }


    @GetMapping("/gersome")
    public String getSome(){
        return "some";
    }

    @GetMapping("/get")
    public String get(){
        return "always practicaldfs";
    }

}
