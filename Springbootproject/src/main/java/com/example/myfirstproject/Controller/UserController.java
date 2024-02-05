package com.example.myfirstproject.Controller;



import com.example.myfirstproject.DTO.UserDTO;
import com.example.myfirstproject.Model.User;
import com.example.myfirstproject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") int id){

        return userService.getUser(id);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<String>  updateUser(@RequestBody User user){

        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<String>  deleteUser(@PathVariable int id){
       return  userService.deleteUser(id);

    }
}
