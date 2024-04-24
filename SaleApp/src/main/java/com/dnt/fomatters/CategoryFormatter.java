/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnt.fomatters;

import com.dnt.pojo.Category;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author DikamonTu
 */
public class CategoryFormatter implements Formatter<Category>{
    
    @Override
    public String print(Category cate, Locale locale){
        return String.valueOf(cate.getId());
    }
    
    @Override
    public Category parse(String cateId, Locale locale){
        Category c = new Category();
        c.setId(Integer.parseInt(cateId));
        
        return c;
    }
}
