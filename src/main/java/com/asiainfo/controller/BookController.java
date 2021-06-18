package com.asiainfo.controller;

import com.asiainfo.bean.Book;
import com.asiainfo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * @author 24
 * @date 2021/6/18
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll")
    @ResponseBody
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
