package md.tekwill.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    List<Task> tasks = new ArrayList<>();

    @PostMapping("/tasks")
    public void addTask(@RequestBody Task task) {
        if(!task.getName().trim().isEmpty()) {
            tasks.add(task);
        }
    }

    @GetMapping("/")
    public String mainPage() {
        return "Hello World!";
    }
}