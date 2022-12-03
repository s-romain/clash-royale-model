package fr.sromain.clashroyale.api.model;

import lombok.Data;

import java.util.List;

@Data
public class Player {
    PlayerClan clan;
    Arena arena;
    // TODO : Set to Enum
    String role;
    Integer wins;
    Integer losses;
    Integer totalDonations;
    PlayerLeagueStatistics leagueStatistics;
    List<PlayerItemLevel> cards;
    Item currentFavouriteCard;
    List<PlayerAchievementBadge> badges;
    String tag;
    String name;
    Integer expLevel;
    Integer trophies;
    Integer bestTrophies;
    Integer donations;
    Integer donationsReceived;
    List<PlayerAchievementProgress> achievements;
    Integer battleCount;
    Integer threeCrownWins;
    Integer challengeCardsWon;
    Integer challengeMaxWins;
    Integer tournamentCardsWon;
    Integer tournamentBattleCount;
    List<PlayerItemLevel> currentDeck;
    Integer warDayWins;
    Integer clanCardsCollected;
    Integer starPoints;
    Integer expPoints;
    Integer totalExpPoints;
}
