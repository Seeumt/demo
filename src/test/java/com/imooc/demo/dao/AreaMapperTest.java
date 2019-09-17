package com.imooc.demo.dao;

import com.imooc.demo.Entity.Area;
import com.imooc.demo.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class AreaMapperTest {
    @Autowired
    private AreaMapper areaMapper;
    @Test
    public void selectByAreaId() {
        Area area = areaMapper.selectByAreaId(1);
        System.out.println(JsonUtil.toJson(area));
    }
}