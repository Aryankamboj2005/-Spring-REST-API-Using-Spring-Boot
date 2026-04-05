package com.Aryan.SimpleWebApp.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // llinking lombok
@AllArgsConstructor // make the constructor for the all argument
@NoArgsConstructor // make the constructor for the no argument
public class product {
    private int price;
    private String name ;
    private int productId;
}
