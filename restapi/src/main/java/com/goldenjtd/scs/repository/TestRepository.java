/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldenjtd.scs.repository;

import com.goldenjtd.scs.model.TestModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

/**
 *
 * @author liangwang
 */
@Repository
public class TestRepository {

    private Map<Integer, TestModel> testModels = new HashMap<Integer, TestModel>();

    @PostConstruct
    public void setup() {
        testModels.put(1, new TestModel(1, "Mert Caliskan"));
        testModels.put(2, new TestModel(2, "Kenan Sevindik"));
    }

    public void save(TestModel testmodel) {
        testModels.put(testmodel.getId(), testmodel);
    }

    public List<TestModel> findAll() {
        return new ArrayList<>(testModels.values());
    }

    public TestModel find(int id) {
        return testModels.get(id);
    }

    public void update(int id, TestModel testmodel) {
        testModels.put(id, testmodel);
    }

    public void delete(int id) {
        testModels.remove(id);
    }
}
