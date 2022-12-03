package fr.sromain.clash.entities;

import lombok.Data;

@Data
public class Location {
    String localizedName;
    Integer id;
    String name;
    Boolean isCountry;
    String countryCode;
}
