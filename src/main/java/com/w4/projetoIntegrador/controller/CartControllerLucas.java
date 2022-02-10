package com.w4.projetoIntegrador.controller;
import com.w4.projetoIntegrador.dtos.CartDto;
import com.w4.projetoIntegrador.service.CartService;
import com.w4.projetoIntegrador.service.CartServiceLucas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/quantity")
public class CartControllerLucas {
    @Autowired
    CartServiceLucas cartServiceLucas;

    @GetMapping("/{id}")
    public ResponseEntity<CartDto> getCart(@PathVariable Long id){
        return ResponseEntity.ok().body(cartServiceLucas.get(id));
    }

    @PostMapping()
    public ResponseEntity<CartDto> createCart (@RequestBody CartDto cartDto) {
        return ResponseEntity.status(201).body(cartServiceLucas.create(cartDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartDto> updateCart (@PathVariable Long id, @RequestBody CartDto cartDto){
        return ResponseEntity.status(201).body(cartServiceLucas.updateCart(id, cartDto));
    }
}
