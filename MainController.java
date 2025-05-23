package com.shoppingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/cart")
public class MainController {
    @Autowired
    private ProductDetailsRepo productDetailsRepo;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewProduct(@RequestParam String productName, @RequestParam String productCategory, @RequestParam Double price, @RequestParam Integer quantity){
       ProductDetails p = new ProductDetails();
       p.setProductName(productName);
       p.setProductCategory(productCategory);
       p.setPrice(price);
       p.setQuantity(quantity);
       productDetailsRepo.save(p);
       return "added";
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<ProductDetails> getAllProducts(){
        return productDetailsRepo.findAll();
    }
    
}
