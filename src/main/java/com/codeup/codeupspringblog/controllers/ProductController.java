package com.codeup.zenithspringblog.controllers;

import com.codeup.codeupspringblog.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products/create")
    public String returnProductCreateView() {
        return "product/create";
    }

    @PostMapping("/products/create")
    public String insertProduct(@RequestParam String name, @RequestParam int price) {
        System.out.println(name);
        System.out.println(price);
        // create a product object from request params
        // print out the product
        // redirect to the "/"
        return "redirect:/";
    }

    @GetMapping("/products")
    public String getProductsIndexPage(Model model) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Xbox", 22000),
                new Product(2L, "3DO", 20),
                new Product(3L, "CDI", 500)
        ));

//        List<Product> filteredProductsList = products
//            .stream()
//            .filter(product -> product.getCostInCents() < 100)
//            .collect(Collectors.toList());

        model.addAttribute("products", products);
        return "product/index";
    }

}