package com.hcltech.fullstack.dao;
import java.util.List;

import com.hcltech.fullstack.entity.Article;
public interface IArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    void createArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
}
 