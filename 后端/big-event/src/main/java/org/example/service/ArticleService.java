package org.example.service;

import org.example.pojo.Article;
import org.example.pojo.PageBean;

public interface ArticleService {
//新增文章
    void add(Article article);
//条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, String categoryId, String state);
//更新文章
    void update(Article article);
//获取文章详情
    Article detail(Integer id);
//删除文章
    void delete(Integer id);
}
