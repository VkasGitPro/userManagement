package com.example.myfirstproject.Service;


import com.example.myfirstproject.DTO.UserDTO;
import com.example.myfirstproject.Model.User;
import com.example.myfirstproject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    StudentRepo repo;

    @Autowired
    UserDTO userdto;

    //Post user
    public ResponseEntity<String> addUser(User user){

        repo.save(user);
        return new ResponseEntity<>("User Created Successfully", HttpStatus.CREATED);
    }

    //Get user
    public ResponseEntity<UserDTO> getUser(int id){
        User user = repo.findById(id).get();
        userdto.setId(user.getId());
        userdto.setEmail(user.getEmail());
        userdto.setName(user.getName());

        return new ResponseEntity<>(userdto, HttpStatus.OK);
    }
    //update user
    public ResponseEntity<String> updateUser(User user){

        User updatedUser=repo.findById(user.getId()).orElse(new User());
        updatedUser.setId(user.getId());
        updatedUser.setName(user.getName());
        updatedUser.setAddress(user.getAddress());
        updatedUser.setEmail(user.getEmail());

        repo.save(updatedUser);

        return new ResponseEntity<>("User Updated Successfully",HttpStatus.OK);
    }
    //delete user
    public ResponseEntity<String> deleteUser(int id){
        User deletedUser=repo.findById(id).get();
        repo.delete(deletedUser);
        return  new ResponseEntity<>("User Deleted Successfully",HttpStatus.OK);
    }

}
