package com.boots.geda_dash_backend.dto;

public class UpdateIndicatorDTO {

    private String organisationFullName;
    private String organisationContactName;
    private String organisationContactEmail;
    private String organisationWebsite;
    private String indicatorDescription;
    private String methodology;
    private String communicationDetails;

    public UpdateIndicatorDTO() {
    }

    public UpdateIndicatorDTO(String organisationFullName, String organisationContactName, String organisationContactEmail, String organisationWebsite, String indicatorDescription, String methodology, String communicationDetails) {
        this.organisationFullName = organisationFullName;
        this.organisationContactName = organisationContactName;
        this.organisationContactEmail = organisationContactEmail;
        this.organisationWebsite = organisationWebsite;
        this.indicatorDescription = indicatorDescription;
        this.methodology = methodology;
        this.communicationDetails = communicationDetails;
    }

    public String getOrganisationFullName() {
        return organisationFullName;
    }

    public void setOrganisationFullName(String organisationFullName) {
        this.organisationFullName = organisationFullName;
    }

    public String getOrganisationContactName() {
        return organisationContactName;
    }

    public void setOrganisationContactName(String organisationContactName) {
        this.organisationContactName = organisationContactName;
    }

    public String getOrganisationContactEmail() {
        return organisationContactEmail;
    }

    public void setOrganisationContactEmail(String organisationContactEmail) {
        this.organisationContactEmail = organisationContactEmail;
    }

    public String getOrganisationWebsite() {
        return organisationWebsite;
    }

    public void setOrganisationWebsite(String organisationWebsite) {
        this.organisationWebsite = organisationWebsite;
    }

    public String getIndicatorDescription() {
        return indicatorDescription;
    }

    public void setIndicatorDescription(String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    public String getCommunicationDetails() {
        return communicationDetails;
    }

    public void setCommunicationDetails(String communicationDetails) {
        this.communicationDetails = communicationDetails;
    }

    @Override
    public String toString() {
        return "UpdateIndicatorDTO{" +
                "organisationFullName='" + organisationFullName + '\'' +
                ", organisationContactName='" + organisationContactName + '\'' +
                ", organisationContactEmail='" + organisationContactEmail + '\'' +
                ", organisationWebsite='" + organisationWebsite + '\'' +
                ", indicatorDescription='" + indicatorDescription + '\'' +
                ", methodology='" + methodology + '\'' +
                ", communicationDetails='" + communicationDetails + '\'' +
                '}';
    }
}
