/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.dnt.hibernatedemo;

import com.dnt.pojo.Category;
import com.dnt.pojo.Product;
import com.dnt.repository.impl.CategoryRepositoryImpl;
import com.dnt.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
            CategoryRepositoryImpl s = new CategoryRepositoryImpl();
            s.getCategories().forEach(c -> System.out.println(c.getName()));
            
            ProductRepositoryImpl ser = new ProductRepositoryImpl();

            Product p = new Product();
            p.setName("ABC");
            p.setPrice(12000000l);
            p.setCategoryId(s.getCateById(1));
            ser.addOrUpdate(p);
//            Map<String, String> params = new HashMap<>();
//            params.put("fromPrice", "18000000");
//            params.put("toPrice", "22000000");
//
//            s.getProducts(params).forEach(p -> System.out.printf("%.0f - %s - %s\n", 
//                    p.getPrice(), p.getId(), p.getCategory().getName()));
            
//            Query q = s.createQuery("From Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));
    }
}
