package DANHHT.Fashion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String Home(){
        return "home/index";
    }
    @GetMapping("shop.html")
    public String Shop(){return "home/shop";}
    @GetMapping("blog.html")
    public String Blog(){return "home/blog";}
    @GetMapping("contact.html")
    public String Contact(){return "home/contact";}
    @GetMapping("product.html")
    public String Product(){return "home/product";}
}
