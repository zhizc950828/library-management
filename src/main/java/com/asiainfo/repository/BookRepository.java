package com.asiainfo.repository;

import com.asiainfo.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 24
 * @date 2021/6/18
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
