package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

/**
 * @author yangchengjie
 */
public interface CategoryService {
    /**
     * 获取所有分类信息
     * @return List
     */
    List<Category> list(Page page);

    /**
     * 获取分页总数
     * @return
     */
    int total();

    /**
     * 添加记录
     */
    void add(Category category);
}
