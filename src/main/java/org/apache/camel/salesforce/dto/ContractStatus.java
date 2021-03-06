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
 * Salesforce DTO for SObject ContractStatus
 */
@XStreamAlias("ContractStatus")
public class ContractStatus extends AbstractSObjectBase {

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

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // IsDefault
    private Boolean IsDefault;

    @JsonProperty("IsDefault")
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    @JsonProperty("IsDefault")
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    // StatusCode
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusCodeEnum StatusCode;

    @JsonProperty("StatusCode")
    public StatusCodeEnum getStatusCode() {
        return this.StatusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(StatusCodeEnum StatusCode) {
        this.StatusCode = StatusCode;
    }

}
