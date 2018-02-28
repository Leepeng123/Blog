package com.lipeng.service.impl;

import com.lipeng.bean.Blog;
import com.lipeng.mapper.BlogMapper;
import com.lipeng.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */

@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;
    @Override
    public List<Blog> selectAllBlog(Integer id) {
        return blogMapper.selectAllBlog(id);
    }

    @Override
    public void deleteBlogById(Integer id) {
        blogMapper.deleteBlogById(id);
    }

    @Override
    public Blog selectBlogById(Integer id) {
        return blogMapper.selectBlogById(id);
    }

    @Override
    public void addBlog(Blog blog) {
        blogMapper.addBlog(blog);
    }
}
