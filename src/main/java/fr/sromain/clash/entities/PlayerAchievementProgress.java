package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class PlayerAchievementProgress {
    Integer stars;
    Integer value;
    String name;
    Integer target;
    String into;
    String completionInfo;
}
