/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject TenantUsageEntitlement
 */
@XStreamAlias("TenantUsageEntitlement")
public class TenantUsageEntitlement extends AbstractSObjectBase {

    // ResourceGroupKey
    private String ResourceGroupKey;

    @JsonProperty("ResourceGroupKey")
    public String getResourceGroupKey() {
        return this.ResourceGroupKey;
    }

    @JsonProperty("ResourceGroupKey")
    public void setResourceGroupKey(String ResourceGroupKey) {
        this.ResourceGroupKey = ResourceGroupKey;
    }

    // Setting
    private String Setting;

    @JsonProperty("Setting")
    public String getSetting() {
        return this.Setting;
    }

    @JsonProperty("Setting")
    public void setSetting(String Setting) {
        this.Setting = Setting;
    }

    // StartDate
    private org.joda.time.DateTime StartDate;

    @JsonProperty("StartDate")
    public org.joda.time.DateTime getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(org.joda.time.DateTime StartDate) {
        this.StartDate = StartDate;
    }

    // EndDate
    private org.joda.time.DateTime EndDate;

    @JsonProperty("EndDate")
    public org.joda.time.DateTime getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(org.joda.time.DateTime EndDate) {
        this.EndDate = EndDate;
    }

    // CurrentAmountAllowed
    private Double CurrentAmountAllowed;

    @JsonProperty("CurrentAmountAllowed")
    public Double getCurrentAmountAllowed() {
        return this.CurrentAmountAllowed;
    }

    @JsonProperty("CurrentAmountAllowed")
    public void setCurrentAmountAllowed(Double CurrentAmountAllowed) {
        this.CurrentAmountAllowed = CurrentAmountAllowed;
    }

    // Frequency
    @XStreamConverter(PicklistEnumConverter.class)
    private FrequencyEnum Frequency;

    @JsonProperty("Frequency")
    public FrequencyEnum getFrequency() {
        return this.Frequency;
    }

    @JsonProperty("Frequency")
    public void setFrequency(FrequencyEnum Frequency) {
        this.Frequency = Frequency;
    }

    // IsPersistentResource
    private Boolean IsPersistentResource;

    @JsonProperty("IsPersistentResource")
    public Boolean getIsPersistentResource() {
        return this.IsPersistentResource;
    }

    @JsonProperty("IsPersistentResource")
    public void setIsPersistentResource(Boolean IsPersistentResource) {
        this.IsPersistentResource = IsPersistentResource;
    }

    // HasRollover
    private Boolean HasRollover;

    @JsonProperty("HasRollover")
    public Boolean getHasRollover() {
        return this.HasRollover;
    }

    @JsonProperty("HasRollover")
    public void setHasRollover(Boolean HasRollover) {
        this.HasRollover = HasRollover;
    }

    // OverageGrace
    private Double OverageGrace;

    @JsonProperty("OverageGrace")
    public Double getOverageGrace() {
        return this.OverageGrace;
    }

    @JsonProperty("OverageGrace")
    public void setOverageGrace(Double OverageGrace) {
        this.OverageGrace = OverageGrace;
    }

    // AmountUsed
    private Double AmountUsed;

    @JsonProperty("AmountUsed")
    public Double getAmountUsed() {
        return this.AmountUsed;
    }

    @JsonProperty("AmountUsed")
    public void setAmountUsed(Double AmountUsed) {
        this.AmountUsed = AmountUsed;
    }

    // UsageDate
    private org.joda.time.DateTime UsageDate;

    @JsonProperty("UsageDate")
    public org.joda.time.DateTime getUsageDate() {
        return this.UsageDate;
    }

    @JsonProperty("UsageDate")
    public void setUsageDate(org.joda.time.DateTime UsageDate) {
        this.UsageDate = UsageDate;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

}
