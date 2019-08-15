package com.tk.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.tk.elastic.bean.Book;

import java.util.List;


public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    //参照
    // https://docs.spring.io/spring-data/elasticsearch/docs/3.0.6.RELEASE/reference/html/
   public List<Book> findByBookNameLike(String bookName);

}
