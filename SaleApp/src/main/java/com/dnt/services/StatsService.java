/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnt.services;

import java.util.List;

/**
 *
 * @author admin
 */
public interface StatsService {
     public List<Object[]> statsRevenueByProduct();
    public List<Object[]> statsRevenueByPeriod(int year, String period);
}
