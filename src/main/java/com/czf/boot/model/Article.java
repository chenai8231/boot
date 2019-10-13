package com.czf.boot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    /**
     * id : 1
     * author : czf
     * title : 手把手教你开发springboot
     * content : c
     * createTime :
     * reader : [{"name":"czf","age":18},{"name":"kobe","age":37}]
     * {
     * 	"id":1,
     * 	"authod":"czf",
     * 	"title":"SpringBoot",
     * 	"content":"c",
     * 	"createTime":"",
     * 	"reader":[{"name":"czf","age":18},{"name":"curry","age":24}]
     * }
     */
    @JsonIgnore
    private Long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> reader;

}
