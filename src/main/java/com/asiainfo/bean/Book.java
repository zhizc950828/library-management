package com.asiainfo.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Proxy;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author 24
 * @date 2021/6/18
 */
@Data
@Entity
@Proxy(lazy = false)
@DynamicInsert
public class Book {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
}
