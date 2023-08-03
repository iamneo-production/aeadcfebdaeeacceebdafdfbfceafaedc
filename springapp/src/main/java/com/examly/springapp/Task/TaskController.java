package com.examly.springapp.Task;


// controlls the logic from DB 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TaskController {
    
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String sayHello(){
        return "Hello From /";
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllList();
    }

    @RequestMapping("/getTask")
    public Task getTask(@RequestParam("id") Integer id) {
        return taskService.getTask(id);
    }

    @PostMapping(value="/saveTask")
    public void createTask(@RequestBody Task task) {
        taskService.createTask(task);
    }
    
    // PUT REQ
    @RequestMapping(value = "/changeStatus", method = RequestMethod.PUT)
    public void updateStatus(@RequestParam("id") Integer id,  @RequestBody Task task ) { 
        taskService.updateStatus(id, task);
    }
    
    
    // Delete Req
    @DeleteMapping(value = "/deleteTask")
    public void deleteTask(@RequestParam("id") Integer id) { 
        taskService.deleteTask(id);
    }
    


}