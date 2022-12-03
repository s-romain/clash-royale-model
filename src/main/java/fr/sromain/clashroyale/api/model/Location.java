package fr.sromain.clashroyale.api.model;

import lombok.Data;

@Data
public class Location {
    String localizedName;
    Integer id;
    String name;
    Boolean isCountry;
    String countryCode;
}
