package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class PlayerLeagueStatistics {
    LeagueSeasonResult previousSeason;
    LeagueSeasonResult bestSeason;
    LeagueSeasonResult currentSeason;
}
