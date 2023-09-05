package com.example.facebookclone.Repositories;

import com.example.facebookclone.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long>{
    List<Posts> findAllByUsersId(Long id);
}
