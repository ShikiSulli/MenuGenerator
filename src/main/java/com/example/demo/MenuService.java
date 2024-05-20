package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MenuService {
     @Autowired
     private PlatRepository platRepository;

    private List<Plat> plats;

    public Menu genererMenu() {
        Menu menu = new Menu();
        Random rand = new Random();

        String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        for (String jour : jours) {
            List<Plat> dejeuner = new ArrayList<>();
            List<Plat> diner = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                dejeuner.add(plats.get(rand.nextInt(plats.size())));
                diner.add(plats.get(rand.nextInt(plats.size())));
            }

            menu.getDejeuner().put(jour, dejeuner);
            menu.getDiner().put(jour, diner);
        }

        return menu;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
    // autres méthodes, comme ajouter des plats à la liste
    public void ajouterPlat(Plat plat) {
        plats.add(plat);
    }
}
