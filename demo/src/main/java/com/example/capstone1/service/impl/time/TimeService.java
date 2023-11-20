package com.example.capstone1.service.impl.time;

import com.example.capstone1.model.Time;
import com.example.capstone1.repository.time.ITimeRepository;
import com.example.capstone1.service.time.ITimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService implements ITimeService {
    @Autowired
    private ITimeRepository iTimeRepository;
    @Override
    public List<Time> getAllTime() {
        return iTimeRepository.findAll();
    }
}
