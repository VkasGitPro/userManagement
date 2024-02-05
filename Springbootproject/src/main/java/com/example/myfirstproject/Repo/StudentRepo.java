package com.example.myfirstproject.Repo;


import com.example.myfirstproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<User,Integer> {
}
