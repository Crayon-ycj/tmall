package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

/**
 * @author yangchengjie
 */
public interface CategoryMapper {
    /**
     * 查询分页列表
     * @return List
     */
    List<Category> list(Page page);

    /**
     * 查询总页数
     * @return int
     */
    int total();

    /**
     * 添加记录
     * @param category
     */
    void add(Category category);

    /**
     * 删除记录
     * @param id
     */
    void delete(int id);
}
