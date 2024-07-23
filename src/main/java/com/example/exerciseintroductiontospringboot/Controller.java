package com.example.exerciseintroductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
//- GET /name : returns “My name is .......”
//- GET /age : returns “My age is ........”
//- GET /check/status : returns “Everything OK”
//- GET /health : returns “Server health is up and running”
//- Get /names : return array of names
    @GetMapping("/name")
    public String name(){
        return "My name is Mohammed";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 24";
    }

    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Mohammed");
        names.add("Tariq");
        names.add("Abdullah");
        names.add("Abdulazez");
        return names;
    }
}
