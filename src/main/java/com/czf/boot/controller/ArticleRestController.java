package com.czf.boot.controller;

import com.czf.boot.model.AjaxResponse;
import com.czf.boot.model.Article;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;




@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //@RequestMapping(value="/acticle",method=POST,produces="application/json")
    @PostMapping("/acticle")
    public AjaxResponse saveArticle(@RequestBody Article article){

        log.info("saveArticle:{}",article);
        return AjaxResponse.success(article);
    }
    //@RequestMapping(value="/acticle/{id}",method=DELETE,produces="application/json")
    @DeleteMapping("/acticle/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id){

        log.info("deleteArticle:{}",id);
        return AjaxResponse.success(id);
    }
    //@RequestMapping(value="/acticle/{id}",method=PUT,produces="application/json")
    @PutMapping("/acticle/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id,@RequestBody Article article){
        article.setId(id);
        log.info("updateArticle:{}",article);
        return AjaxResponse.success(article);
    }
    //@RequestMapping(value="/acticle/{id}",method=GET,produces="application/json")
    @GetMapping("/acticle/{id}")
    public AjaxResponse getArticle(@PathVariable Long id){
        Article article1=Article.builder().id(1L).author("czf").content("SpringBoot深入浅出").createTime(new Date()).title("t1").build();

        return AjaxResponse.success(article1);
    }
}
