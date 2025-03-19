package com.boots.geda_dash_backend.modal;


import jakarta.persistence.*;

@Entity
public class Indicator {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    organisation fields
    private int id;
    private String organisationId;
    private String organisationFullName;
    private String organisationContactName;
    private String organisationContactEmail;
    private String organisationWebsite;
//    indicator detail fields
    private String indicatorShortName;
    private String indicatorDescription;
    private String countryCountries;
    private String indicatorStartYear;

//    fields with checkboxes
    @Column(name = "indicator_footprint", columnDefinition = "json")
    private String indicatorFootprint;
    @Column(name = "indicator_thematic_areas", columnDefinition = "json")
    private String indicatorThematicAreas;
    @Column(name = "indicator_category", columnDefinition = "json")
    private String indicatorCategory;
    @Column(name = "type_of_data", columnDefinition = "json")
    private String typeOfData;
    @Column(name = "groups_supported_with_data", columnDefinition = "json")
    private String groupsSupportedWithData;
    @Column(name = "purpose_of_data", columnDefinition = "json")
    private String purposeOfData;
    @Column(name = "target_audience", columnDefinition = "json")
    private String targetAudience;
    @Column(name = "data_replicability", columnDefinition = "json")
    private String dataReplicability;
    @Column(name = "pre_analysis", columnDefinition = "json")
    private String preAnalysis;
    @Column(name = "data_type", columnDefinition = "json")
    private String dataType;
    @Column(name = "data_analysis", columnDefinition = "json")
    private String dataAnalysis;
    @Column(name = "result_validation", columnDefinition = "json")
    private String resultValidation;
    @Column(name = "frequency", columnDefinition = "json")
    private String frequency;
    @Column(name = "public_sharing_consent", columnDefinition = "json")
    private String publicSharingConsent;
    @Column(name = "frequent_information_updates", columnDefinition = "json")
    private String frequentInformationUpdates;
    @Column(name = "webscrapping_approval", columnDefinition = "json")
    private String webscrappingApproval;
    @Column(name = "dashboard_usage", columnDefinition = "json")
    private String dashboardUsage;


//    additional information fields
    private String linksToCollectedData;
    private String dataCommunicatedInThePublicSpace;
    private String communicationDetails;
    private String moreDetailOnThMethodology;
}
