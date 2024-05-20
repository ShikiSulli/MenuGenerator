package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlatController {

    @Autowired
    private PlatRepository platRepository;

    @PostMapping("/plats")
    public Plat createPlat(@RequestBody Plat plat) {
        return platRepository.save(plat);
    }

    @GetMapping("/plats")
    public List<Plat> getPlats() {
        return platRepository.findAll();
    }
}