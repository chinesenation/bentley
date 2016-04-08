/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldenjtd.scs.service;

import com.goldenjtd.scs.model.TestModel;
import com.goldenjtd.scs.repository.TestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author liangwang
 */
@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public void save(TestModel testmodel) {
        testRepository.save(testmodel);
    }

    public List<TestModel> findAll() {
        return testRepository.findAll();
    }

    public TestModel find(int id) {
        return testRepository.find(id);
    }

    public void update(int id, TestModel testmodel) {
        testRepository.update(id, testmodel);
    }

    public void delete(int id) {
        testRepository.delete(id);
    }
}
