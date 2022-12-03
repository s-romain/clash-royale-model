package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class PlayerItemLevelList {
    Integer id;
    Integer count;
    Integer level;
    Integer startLevel;
    Boolean used;
    String name;
    Integer maxLevel;
//    List<Object> iconUrls;
}
