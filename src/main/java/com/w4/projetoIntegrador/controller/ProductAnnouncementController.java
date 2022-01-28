package com.w4.projetoIntegrador.controller;

import com.w4.projetoIntegrador.entities.Product;
import com.w4.projetoIntegrador.entities.ProductAnnouncement;
import com.w4.projetoIntegrador.service.ProductAnnouncementService;
import com.w4.projetoIntegrador.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productannouncements")
public class ProductAnnouncementController {

    @Autowired
    ProductAnnouncementService productAnnouncementService;

    @GetMapping("/{id}")
    public ProductAnnouncement getProduct(@PathVariable Long id){
        return productAnnouncementService.get(id);
    }

    @PostMapping()
    public ProductAnnouncement newProduct(@RequestBody ProductAnnouncement p){
        return productAnnouncementService.save(p);
    }
}