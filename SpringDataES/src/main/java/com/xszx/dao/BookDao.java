package com.xszx.dao;

import com.xszx.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends ElasticsearchRepository<Book,Long> {
}
