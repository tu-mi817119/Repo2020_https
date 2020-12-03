package com.xszx.test;

import com.xszx.dao.BookDao;
import com.xszx.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application.xml")
public class BookTest {
    @Autowired
    private ElasticsearchTemplate template;

    @Autowired
    private BookDao bookDao;

    @Test
    public void test(){
        template.createIndex(Book.class);
    }
    @Test
    public void addDocument(){
        Book book = new Book();
        book.setId(1L);
        book.setTitle("笑傲江湖");
        book.setContent("金庸武侠小说...");
        bookDao.save(book);
    }

}
