package com.practice.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "party")
public class Party {

    @Id
    private String partyId;
    private String partyTypeId;
    private String externalId;
    private String preferredCurrencyUomId;
    private String description;
    private String statusId;
    private Timestamp createdDate;
    private String createdByUserLogin;
    private Timestamp lastModifiedDate;
    private String lastModifiedByUserLogin;
    private String dataSourceId;
    private String isUnread;

    public Party() {}

    public Party(String partyId, String partyTypeId, String externalId, String preferredCurrencyUomId, String description, String statusId, Timestamp createdDate, String createdByUserLogin, Timestamp lastModifiedDate, String lastModifiedByUserLogin, String dataSourceId, String isUnread) {
        this.partyId = partyId;
        this.partyTypeId = partyTypeId;
        this.externalId = externalId;
        this.preferredCurrencyUomId = preferredCurrencyUomId;
        this.description = description;
        this.statusId = statusId;
        this.createdDate = createdDate;
        this.createdByUserLogin = createdByUserLogin;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
        this.dataSourceId = dataSourceId;
        this.isUnread = isUnread;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getPreferredCurrencyUomId() {
        return preferredCurrencyUomId;
    }

    public void setPreferredCurrencyUomId(String preferredCurrencyUomId) {
        this.preferredCurrencyUomId = preferredCurrencyUomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getIsUnread() {
        return isUnread;
    }

    public void setIsUnread(String isUnread) {
        this.isUnread = isUnread;
    }
}
