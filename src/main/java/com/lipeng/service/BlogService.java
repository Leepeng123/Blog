package com.lipeng.service;

import com.lipeng.bean.Blog;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
public interface BlogService {
    List<Blog> selectAllBlog(Integer id);

    void deleteBlogById(Integer id);

    Blog selectBlogById(Integer id);

    void addBlog(Blog blog);
}
