package dio.web.api.controller;

import dio.web.api.Repository.UserRepository;
import dio.web.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository respository;
    @GetMapping("/users")
    public List<User> getUsers(){
    return respository.findAll();
    }
    @GetMapping("/users/{username}")
    public User getOne(@PathVariable("username") String username){
        return  respository.findByUsername(username);
    }
    @DeleteMapping
    public void delete(@PathVariable("id") Integer id){
        respository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody User user){
    respository.save(user);
    }

}
