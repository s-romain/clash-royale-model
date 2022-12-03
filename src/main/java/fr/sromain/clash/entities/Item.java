package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class Item {
    IconUrls iconUrls;
    String name;
    Integer id;
    Integer maxLevel;
}
