/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnt.services.impl;

import com.cloudinary.Cloudinary;
import com.dnt.pojo.Product;
import com.dnt.repositories.ProductRepository;
import com.dnt.services.ProductService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;
    @Autowired
    private Cloudinary cloudinary;
    
    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.productRepo.getProducts(params);
    }

    @Override
    public void addOrUpdate(Product p) {
        if(!p.getFile().isEmpty()){
            try{
                
            } catch(IOException ex){
                
            }
        }
         this.productRepo.addOrUpdate(p);
    }
    
}
