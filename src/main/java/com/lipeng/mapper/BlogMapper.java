package com.lipeng.mapper;

import com.lipeng.bean.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
@Repository
public interface BlogMapper {

    List<Blog> selectAllBlog(Integer id);

    void deleteBlogById(Integer id);

    Blog selectBlogById(Integer id);

    void addBlog(Blog blog);
}
