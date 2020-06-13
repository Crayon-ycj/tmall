package com.how2java.tmall.service.impl;

import com.how2java.tmall.mapper.CategoryMapper;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.CategoryExample;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;


    /**
     * 删除记录
     *
     * @param id
     */
    @Override
    public void delete(int id) {
        categoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 通过id获取分类
     *
     * @param id
     * @return
     */
    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

    /**
     * 添加记录
     */
    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }

    /**
     * 更新信息
     *
     * @param category
     */
    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }
}
