package org.umssdiplo.automationv01.core.input;

public class Incident {
    private String accidentDate;
    private String accidentHr;
    private String accidentDay;
    private String incidentType;
    private String incidentAgent;
    private String affectedParts;
    private String accidentSite;

    public Incident() {
        accidentDate = "01011998";
        accidentHr = "01";
        accidentDay = "Monday";
        incidentType = "Critica";
        incidentAgent="Medios de transporte";
        affectedParts="Brazo";
        accidentSite="Cochabamba";
    }

    public String getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(String accidentDate) {
        this.accidentDate = accidentDate;
    }

    public String getAccidentHr() {
        return accidentHr;
    }

    public void setAccidentHr(String accidentHr) {
        this.accidentHr = accidentHr;
    }

    public String getAccidentDay() {
        return accidentDay;
    }

    public void setAccidentDay(String accidentDay) {
        this.accidentDay = accidentDay;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentAgent() {
        return incidentAgent;
    }

    public void setIncidentAgent(String incidentAgent) {
        this.incidentAgent = incidentAgent;
    }

    public String getAffectedParts() {
        return affectedParts;
    }

    public void setAffectedParts(String affectedParts) {
        this.affectedParts = affectedParts;
    }

    public String getAccidentSite() {
        return accidentSite;
    }

    public void setAccidentSite(String accidentSite) {
        this.accidentSite = accidentSite;
    }
}
