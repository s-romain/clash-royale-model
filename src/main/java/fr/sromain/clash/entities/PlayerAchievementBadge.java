package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class PlayerAchievementBadge {
    IconUrls iconUrls;
    Integer maxLevel;
    Integer progress;
    Integer level;
    Integer target;
    String name;
}
