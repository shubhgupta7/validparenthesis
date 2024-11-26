package com.Project.ValidParenthesis.controllers;

import com.Project.ValidParenthesis.model.stackInfo;
import com.Project.ValidParenthesis.repository.stackInfoRepo;
import com.Project.ValidParenthesis.services.stackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
public class homeControllers {

    @Autowired
    private stackService stack;

    @Autowired
    private stackInfoRepo stackRepo;
    @GetMapping("/getAll")
    public List<stackInfo> getAl(){
        return stackRepo.findAll();
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
        stackInfo data = new stackInfo(string, update, LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        String m = data.getResult();
        stackRepo.save(data);
        return m;
    }
}
