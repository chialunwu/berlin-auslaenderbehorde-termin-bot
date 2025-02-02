package org.example.enums;

public enum Section2FormElementsEnum {

    COUNTRY("xi-sel-400", "sel_staat"),
    COUNTRY_OF_FAMILY_MEMBER("xi-sel-428", "fmlyMemNationality"),
    APPLICANT_COUNT("xi-sel-422", "personenAnzahl_normal"),
    FAMILY_STATUS("xi-sel-427", "lebnBrMitFmly"),
    TIME_SLOT("xi-sel-3", "dd_zeiten");

    private final String id;
    private final String name;

    Section2FormElementsEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    }
