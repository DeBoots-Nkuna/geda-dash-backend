package com.boots.geda_dash_backend.modal;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Indicator {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    organisation fields
    private int id;
    @JsonProperty("Organisation ID")
    private String organisationId;
    @JsonProperty("Organisation Full Name")
    private String organisationFullName;
    @JsonProperty("Organisation contact Name")
    private String organisationContactName;
    @JsonProperty("Organisation Contact email")
    private String organisationContactEmail;
    @JsonProperty("Organisation website")
    private String organisationWebsite;
//    indicator detail fields
    @JsonProperty("Indicator Short Name")
    private String indicatorShortName;
    @JsonProperty("Indicator Description")
    private String indicatorDescription;
    @JsonProperty("Country/Countries")
    private String countryCountries;
    @JsonProperty("Indicator year start")
    private String indicatorYearStart;

//    fields with checkboxes
    @JsonProperty("Indicator Footprint")
    @Column(name = "indicator_footprint", columnDefinition = "json")
    private String indicatorFootprint;
    @JsonProperty("Indicator thematic areas")
    @Column(name = "indicator_thematic_areas", columnDefinition = "json")
    private String indicatorThematicAreas;
    @JsonProperty("Indicator category")
    @Column(name = "indicator_category", columnDefinition = "json")
    private String indicatorCategory;
    @JsonProperty("Type of Data")
    @Column(name = "type_of_data", columnDefinition = "json")
    private String typeOfData;
    @JsonProperty("Groups supported with data")
    @Column(name = "groups_supported_with_data", columnDefinition = "json")
    private String groupsSupportedWithData;
    @JsonProperty("Purpose of data")
    @Column(name = "purpose_of_data", columnDefinition = "json")
    private String purposeOfData;
    @JsonProperty("Target audience")
    @Column(name = "target_audience", columnDefinition = "json")
    private String targetAudience;
    @JsonProperty("Data replicability")
    @Column(name = "data_replicability", columnDefinition = "json")
    private String dataReplicability;
    @JsonProperty("Pre-analysis")
    @Column(name = "pre_analysis", columnDefinition = "json")
    private String preAnalysis;
    @JsonProperty("Data type")
    @Column(name = "data_type", columnDefinition = "json")
    private String dataType;
    @JsonProperty("Data analysis")
    @Column(name = "data_analysis", columnDefinition = "json")
    private String dataAnalysis;
    @JsonProperty("Result Validation")
    @Column(name = "result_validation", columnDefinition = "json")
    private String resultValidation;
    @JsonProperty("Frequency")
    @Column(name = "frequency", columnDefinition = "json")
    private String frequency;
    @JsonProperty("Public sharing consent")
    @Column(name = "public_sharing_consent", columnDefinition = "json")
    private String publicSharingConsent;
    @JsonProperty("Frequent information updates")
    @Column(name = "frequent_information_updates", columnDefinition = "json")
    private String frequentInformationUpdates;
    @JsonProperty("WebScrapping approval")
    @Column(name = "webscrapping_approval", columnDefinition = "json")
    private String webscrappingApproval;
    @JsonProperty("Dashboard usage")
    @Column(name = "dashboard_usage", columnDefinition = "json")
    private String dashboardUsage;




    //    additional information fields
    @JsonProperty("Links to collected data")
    private String linksToCollectedData;
    @JsonProperty("data communicated in the public space")
    private String dataCommunicatedInThePublicSpace;
    @JsonProperty("Communication Details")
    private String communicationDetails;
    @JsonProperty("More detail on the methodology")
    private String moreDetailOnTheMethodology;
    @JsonProperty("Indicator Image")
    @Column(name="indicator_image", columnDefinition = "LONGTEXT")
    private String indicatorImage;
    @JsonProperty("Methodology")
    private String methodology;


    public Indicator() {

    }

    public Indicator(int id, String organisationId, String organisationFullName, String organisationContactName, String organisationContactEmail, String organisationWebsite, String indicatorShortName, String indicatorDescription, String countryCountries, String indicatorYearStart, String indicatorFootprint, String indicatorThematicAreas, String indicatorCategory, String typeOfData, String groupsSupportedWithData, String purposeOfData, String targetAudience, String dataReplicability, String preAnalysis, String dataType, String dataAnalysis, String resultValidation, String frequency, String publicSharingConsent, String frequentInformationUpdates, String webscrappingApproval, String dashboardUsage, String linksToCollectedData, String dataCommunicatedInThePublicSpace, String communicationDetails, String moreDetailOnTheMethodology, String indicatorImage, String methodology) {
        this.id = id;
        this.organisationId = organisationId;
        this.organisationFullName = organisationFullName;
        this.organisationContactName = organisationContactName;
        this.organisationContactEmail = organisationContactEmail;
        this.organisationWebsite = organisationWebsite;
        this.indicatorShortName = indicatorShortName;
        this.indicatorDescription = indicatorDescription;
        this.countryCountries = countryCountries;
        this.indicatorYearStart = indicatorYearStart;
        this.indicatorFootprint = indicatorFootprint;
        this.indicatorThematicAreas = indicatorThematicAreas;
        this.indicatorCategory = indicatorCategory;
        this.typeOfData = typeOfData;
        this.groupsSupportedWithData = groupsSupportedWithData;
        this.purposeOfData = purposeOfData;
        this.targetAudience = targetAudience;
        this.dataReplicability = dataReplicability;
        this.preAnalysis = preAnalysis;
        this.dataType = dataType;
        this.dataAnalysis = dataAnalysis;
        this.resultValidation = resultValidation;
        this.frequency = frequency;
        this.publicSharingConsent = publicSharingConsent;
        this.frequentInformationUpdates = frequentInformationUpdates;
        this.webscrappingApproval = webscrappingApproval;
        this.dashboardUsage = dashboardUsage;
        this.linksToCollectedData = linksToCollectedData;
        this.dataCommunicatedInThePublicSpace = dataCommunicatedInThePublicSpace;
        this.communicationDetails = communicationDetails;
        this.moreDetailOnTheMethodology = moreDetailOnTheMethodology;
        this.indicatorImage = indicatorImage;
        this.methodology = methodology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(String organisationId) {
        this.organisationId = organisationId;
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

    public String getIndicatorShortName() {
        return indicatorShortName;
    }

    public void setIndicatorShortName(String indicatorShortName) {
        this.indicatorShortName = indicatorShortName;
    }

    public String getIndicatorDescription() {
        return indicatorDescription;
    }

    public void setIndicatorDescription(String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
    }

    public String getCountryCountries() {
        return countryCountries;
    }

    public void setCountryCountries(String countryCountries) {
        this.countryCountries = countryCountries;
    }

    public String getIndicatorYearStart() {
        return indicatorYearStart;
    }

    public void setIndicatorYearStart(String indicatorYearStart) {
        this.indicatorYearStart = indicatorYearStart;
    }

    public String getIndicatorFootprint() {
        return indicatorFootprint;
    }

    public void setIndicatorFootprint(String indicatorFootprint) {
        this.indicatorFootprint = indicatorFootprint;
    }

    public String getIndicatorThematicAreas() {
        return indicatorThematicAreas;
    }

    public void setIndicatorThematicAreas(String indicatorThematicAreas) {
        this.indicatorThematicAreas = indicatorThematicAreas;
    }

    public String getIndicatorCategory() {
        return indicatorCategory;
    }

    public void setIndicatorCategory(String indicatorCategory) {
        this.indicatorCategory = indicatorCategory;
    }

    public String getTypeOfData() {
        return typeOfData;
    }

    public void setTypeOfData(String typeOfData) {
        this.typeOfData = typeOfData;
    }

    public String getGroupsSupportedWithData() {
        return groupsSupportedWithData;
    }

    public void setGroupsSupportedWithData(String groupsSupportedWithData) {
        this.groupsSupportedWithData = groupsSupportedWithData;
    }

    public String getPurposeOfData() {
        return purposeOfData;
    }

    public void setPurposeOfData(String purposeOfData) {
        this.purposeOfData = purposeOfData;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getDataReplicability() {
        return dataReplicability;
    }

    public void setDataReplicability(String dataReplicability) {
        this.dataReplicability = dataReplicability;
    }

    public String getPreAnalysis() {
        return preAnalysis;
    }

    public void setPreAnalysis(String preAnalysis) {
        this.preAnalysis = preAnalysis;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataAnalysis() {
        return dataAnalysis;
    }

    public void setDataAnalysis(String dataAnalysis) {
        this.dataAnalysis = dataAnalysis;
    }

    public String getResultValidation() {
        return resultValidation;
    }

    public void setResultValidation(String resultValidation) {
        this.resultValidation = resultValidation;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getPublicSharingConsent() {
        return publicSharingConsent;
    }

    public void setPublicSharingConsent(String publicSharingConsent) {
        this.publicSharingConsent = publicSharingConsent;
    }

    public String getFrequentInformationUpdates() {
        return frequentInformationUpdates;
    }

    public void setFrequentInformationUpdates(String frequentInformationUpdates) {
        this.frequentInformationUpdates = frequentInformationUpdates;
    }

    public String getWebscrappingApproval() {
        return webscrappingApproval;
    }

    public void setWebscrappingApproval(String webscrappingApproval) {
        this.webscrappingApproval = webscrappingApproval;
    }

    public String getDashboardUsage() {
        return dashboardUsage;
    }

    public void setDashboardUsage(String dashboardUsage) {
        this.dashboardUsage = dashboardUsage;
    }

    public String getLinksToCollectedData() {
        return linksToCollectedData;
    }

    public void setLinksToCollectedData(String linksToCollectedData) {
        this.linksToCollectedData = linksToCollectedData;
    }

    public String getDataCommunicatedInThePublicSpace() {
        return dataCommunicatedInThePublicSpace;
    }

    public void setDataCommunicatedInThePublicSpace(String dataCommunicatedInThePublicSpace) {
        this.dataCommunicatedInThePublicSpace = dataCommunicatedInThePublicSpace;
    }

    public String getCommunicationDetails() {
        return communicationDetails;
    }

    public void setCommunicationDetails(String communicationDetails) {
        this.communicationDetails = communicationDetails;
    }

    public String getMoreDetailOnTheMethodology() {
        return moreDetailOnTheMethodology;
    }

    public void setMoreDetailOnTheMethodology(String moreDetailOnTheMethodology) {
        this.moreDetailOnTheMethodology = moreDetailOnTheMethodology;
    }

    public String getIndicatorImage() {
        return indicatorImage;
    }

    public void setIndicatorImage(String indicatorImage) {
        this.indicatorImage = indicatorImage;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    @Override
    public String toString() {
        return "Indicator{" +
                "id=" + id +
                ", organisationId='" + organisationId + '\'' +
                ", organisationFullName='" + organisationFullName + '\'' +
                ", organisationContactName='" + organisationContactName + '\'' +
                ", organisationContactEmail='" + organisationContactEmail + '\'' +
                ", organisationWebsite='" + organisationWebsite + '\'' +
                ", indicatorShortName='" + indicatorShortName + '\'' +
                ", indicatorDescription='" + indicatorDescription + '\'' +
                ", countryCountries='" + countryCountries + '\'' +
                ", indicatorYearStart='" + indicatorYearStart + '\'' +
                ", indicatorFootprint='" + indicatorFootprint + '\'' +
                ", indicatorThematicAreas='" + indicatorThematicAreas + '\'' +
                ", indicatorCategory='" + indicatorCategory + '\'' +
                ", typeOfData='" + typeOfData + '\'' +
                ", groupsSupportedWithData='" + groupsSupportedWithData + '\'' +
                ", purposeOfData='" + purposeOfData + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", dataReplicability='" + dataReplicability + '\'' +
                ", preAnalysis='" + preAnalysis + '\'' +
                ", dataType='" + dataType + '\'' +
                ", dataAnalysis='" + dataAnalysis + '\'' +
                ", resultValidation='" + resultValidation + '\'' +
                ", frequency='" + frequency + '\'' +
                ", publicSharingConsent='" + publicSharingConsent + '\'' +
                ", frequentInformationUpdates='" + frequentInformationUpdates + '\'' +
                ", webscrappingApproval='" + webscrappingApproval + '\'' +
                ", dashboardUsage='" + dashboardUsage + '\'' +
                ", linksToCollectedData='" + linksToCollectedData + '\'' +
                ", dataCommunicatedInThePublicSpace='" + dataCommunicatedInThePublicSpace + '\'' +
                ", communicationDetails='" + communicationDetails + '\'' +
                ", moreDetailOnTheMethodology='" + moreDetailOnTheMethodology + '\'' +
                ", indicatorImage='" + indicatorImage + '\'' +
                ", methodology='" + methodology + '\'' +
                '}';
    }
}
