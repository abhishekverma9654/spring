package com.practice.spring.controller;

import com.practice.spring.programs.Program1;
import com.practice.spring.programs.Program2;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/java/programs", method = RequestMethod.GET)
public class ProgramController {

    @GetMapping
    public Map<String, Object> programsList() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("information", "List of Sample java Programs");
        resultMap.put("urls", "add number in url like /java/programs/{1,2,3, ...}");

        List<String> programList = new LinkedList<String>();
        programList.add("1. hello world");

        resultMap.put("programs", programList);
        return resultMap;
    }

    @GetMapping(value = "/1")
    public Map<String, Object> program1() {
        return new HashMap<>(Program1.helloWorld());
    }

    @PostMapping(value = "/2")
    public Map<String, Object> program2(@RequestBody Program2 program2) {
        return new HashMap<>(Program2.calculator(program2.getNum1(), program2.getNum2(), program2.getOperation()));
    }
}
