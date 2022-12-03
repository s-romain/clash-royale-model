package fr.sromain.clashroyale.api.model;

import lombok.Data;

@Data
public class Item {
    IconUrls iconUrls;
    String name;
    Integer id;
    Integer maxLevel;
}
