package DANHHT.Fashion.admin.controller;

import DANHHT.Fashion.model.Brand;
import DANHHT.Fashion.model.Category;
import DANHHT.Fashion.service.BrandServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    public BrandServie brandServie;
    @GetMapping("")
    public  String Brand(Model model){
        model.addAttribute("listbrand",brandServie.getAllBrand());
        return "admin/brand/index";
    }
   @GetMapping("/addbrand")
    public String AddCategory(Model model){
        Brand brand = new Brand();
        model.addAttribute("brand",brand);
        return "admin/brand/addbrand";
    }
    @PostMapping("/savebrand")
    public String saveBrand(@ModelAttribute("brand") Brand brand) {
        brandServie.saveBrand(brand);
        return "redirect:/brand";
    }
    @GetMapping("/deletebrand/{id}")
    public String Deletebrand(@PathVariable(value = "id") long  id){
        this.brandServie.deleteBrandById(id);
        return "redirect:/brand";
    }
    @GetMapping("/editbrand/{id}")
    public String Editbrand(@PathVariable(value = "id") long id, Model model) {
        Brand brand = brandServie.getBrandById(id);
        model.addAttribute("brand", brand);
        return "admin/brand/editbrand";
    }

}
