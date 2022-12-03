package fr.sromain.clashroyale.api.model;

import lombok.Data;

import java.util.List;

@Data
public class Clan {
    List<ClanMember> memberList;
    String tag;
    Integer clanChestMaxLevel;
    // TODO : Change to enum
    String clanChestStatus;
    Integer clanChestLevel;
    Integer clanWarTrophies;
    Integer clanScore;
    Integer requiredTrophies;
    Integer donationsPerWeek;
    Integer badgeId;
    String name;
    Location location;
    // TODO : Change to enum
    String type;
    Integer members;
    String description;
    Integer clanChestPoints;
    IconUrls badgeUrls;
}
