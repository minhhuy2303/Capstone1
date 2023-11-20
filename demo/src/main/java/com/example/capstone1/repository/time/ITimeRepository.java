package com.example.capstone1.repository.time;

import com.example.capstone1.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITimeRepository extends JpaRepository<Time,Integer> {
}
