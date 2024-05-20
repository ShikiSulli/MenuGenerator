package com.example.demo;

import com.example.demo.Plat;
import java.util.List;
import java.util.Map;

public class Menu {
    private Map<String, List<Plat>> dejeuner;
    private Map<String, List<Plat>> diner;

    public Map<String, List<Plat>> getDejeuner() {
        return dejeuner;
    }

    public void setDejeuner(Map<String, List<Plat>> dejeuner) {
        this.dejeuner = dejeuner;
    }

    public Map<String, List<Plat>> getDiner() {
        return diner;
    }

    public void setDiner(Map<String, List<Plat>> diner) {
        this.diner = diner;
    }
}