package com.example.capstone1.repository.doctor;

import com.example.capstone1.model.Doctor;
import com.example.capstone1.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
@Transactional
public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {
    @Query(value="select * from doctor where username = :username",nativeQuery = true)
    Doctor findDoctor(@Param("username")String username);

}
