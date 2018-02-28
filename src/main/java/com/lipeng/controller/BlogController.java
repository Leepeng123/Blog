package com.lipeng.controller;

import com.lipeng.bean.Blog;
import com.lipeng.service.BlogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
@Controller
public class BlogController {

    @Resource
    private BlogService blogService;

    @RequestMapping(value = "home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "add")
    public String add() {
        return "add";
    }


    @ResponseBody
    @RequestMapping(value = "selectAll")
    public List<Blog> selectAll(@Param("id") Integer id){
        return  blogService.selectAllBlog(id);
    }

    @RequestMapping(value = "deleteById")
    public String deleteBlogById(@Param("id") Integer id){
        blogService.deleteBlogById(id);
        return "home";
    }


    @RequestMapping(value = "desc")
    public String selectBlogById(@Param("id") Integer id, Model model){
        Blog blog = blogService.selectBlogById(id);
        model.addAttribute("blog",blog);
        return "desc";
    }

    @RequestMapping(value = "doadd")
    public String doadd(@Param("id") Integer id,@Param("title") String title,@Param("desc") String desc,@Param("content") String content){
        Blog blog = new Blog(title,desc,content,id);
        blogService.addBlog(blog);
        return "home";
    }
}
