/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author TRUCNHU
 */
@Getter
@Setter
@Data
public class Category {
    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
   public String toString()
    {
        return this.name;
    }
}
