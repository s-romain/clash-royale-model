package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class PlayerItemLevel {
    Integer id;
    Integer count;
    Integer level;
    Integer starLevel;
    Boolean used;
    String name;
    Integer maxLevel;
    IconUrls iconUrls;
}
