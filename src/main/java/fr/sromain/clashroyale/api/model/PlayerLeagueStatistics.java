package fr.sromain.clashroyale.api.model;

import lombok.Data;

@Data
public class PlayerLeagueStatistics {
    LeagueSeasonResult previousSeason;
    LeagueSeasonResult bestSeason;
    LeagueSeasonResult currentSeason;
}
