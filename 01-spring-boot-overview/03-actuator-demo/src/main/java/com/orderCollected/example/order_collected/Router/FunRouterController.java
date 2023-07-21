package com.orderCollected.example.order_collected.Router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//class is marked as a RESTful controller using @RestController.
@RestController
public class FunRouterController {

    // expose "/" that return "Hello word"

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // expose a new endpoint for "Workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "Forturne"

    @GetMapping("/forturne")
    public String getDailyForturne() {
        return "Today is your lucky day.";
    }
}
