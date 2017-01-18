package cn.catme.service;

import cn.catme.dao.Entity.TestEntity;
import cn.catme.dao.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by xx on 2017/1/17.
 */
@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;
    public void addOne(String userName){
        TestEntity entity=new TestEntity();
        entity.setUserName(userName);
        entity.setId(0);
        Date now=new Date();
        entity.setRawAddTime(now);
        entity.setRawUpdateTime(now);
        testRepository.save(entity);
    }
}
