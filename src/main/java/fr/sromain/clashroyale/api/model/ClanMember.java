package fr.sromain.clashroyale.api.model;

import lombok.Data;

@Data
public class ClanMember {
    Arena arena;
    Integer clanChestPoints;
    String lastSeen;
    String tag;
    String name;
    // TODO : Change to enum
    String role;
    Integer expLevel;
    Integer trophies;
    Integer clanRank;
    Integer previousClanRank;
    Integer donations;
    Integer donationsReceived;
}
