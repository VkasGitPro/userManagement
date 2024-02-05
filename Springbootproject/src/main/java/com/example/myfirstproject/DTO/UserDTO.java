package com.example.myfirstproject.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
public class UserDTO {

        private int id;
        private String name;
        private String email;

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }



        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }



        public String getEmail() {
            return email;
        }
    }

