package com.example.facebookclone.Repositories;

import com.example.facebookclone.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findFirstByEmail(String email);

}
