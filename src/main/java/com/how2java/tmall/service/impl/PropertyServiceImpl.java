package com.how2java.tmall.service.impl;

import com.how2java.tmall.mapper.PropertyMapper;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.pojo.PropertyExample;
import com.how2java.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyMapper mapper;

    @Override
    public void add(Property c) {
        mapper.insert(c);
    }

    @Override
    public void delete(int id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Property c) {
        mapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public Property get(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Property> list(int cid) {
        PropertyExample example = new PropertyExample();
        example.createCriteria().andCidEqualTo(cid);
        example.setOrderByClause("id desc");

        return mapper.selectByExample(example);
    }
}
