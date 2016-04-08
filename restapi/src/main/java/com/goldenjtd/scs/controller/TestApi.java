/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldenjtd.scs.controller;

import com.goldenjtd.scs.model.TestModel;
import com.goldenjtd.scs.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author liangwang
 */
@RestController
public class TestApi {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/tests" ,method = RequestMethod.POST)
    public void save(@RequestBody TestModel user) {
        testService.save(user);
    }

    @RequestMapping(value = "/tests" ,method = RequestMethod.GET)
    public List<TestModel> list() {
        return testService.findAll();
    }

    @RequestMapping(value = "/tests/{id}", method = RequestMethod.GET)
    public TestModel get(@PathVariable("id") int id) {
        return testService.find(id);
    }

    @RequestMapping(value = "/tests/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") int id, @RequestBody TestModel test) {
        testService.update(id, test);
    }

    @RequestMapping(value = "/tests/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
        testService.delete(id);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }

}
