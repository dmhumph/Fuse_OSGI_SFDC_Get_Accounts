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
 * Salesforce DTO for SObject LoginHistory
 */
@XStreamAlias("LoginHistory")
public class LoginHistory extends AbstractSObjectBase {

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // LoginTime
    private org.joda.time.DateTime LoginTime;

    @JsonProperty("LoginTime")
    public org.joda.time.DateTime getLoginTime() {
        return this.LoginTime;
    }

    @JsonProperty("LoginTime")
    public void setLoginTime(org.joda.time.DateTime LoginTime) {
        this.LoginTime = LoginTime;
    }

    // LoginType
    @XStreamConverter(PicklistEnumConverter.class)
    private LoginTypeEnum LoginType;

    @JsonProperty("LoginType")
    public LoginTypeEnum getLoginType() {
        return this.LoginType;
    }

    @JsonProperty("LoginType")
    public void setLoginType(LoginTypeEnum LoginType) {
        this.LoginType = LoginType;
    }

    // SourceIp
    private String SourceIp;

    @JsonProperty("SourceIp")
    public String getSourceIp() {
        return this.SourceIp;
    }

    @JsonProperty("SourceIp")
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    // LoginUrl
    private String LoginUrl;

    @JsonProperty("LoginUrl")
    public String getLoginUrl() {
        return this.LoginUrl;
    }

    @JsonProperty("LoginUrl")
    public void setLoginUrl(String LoginUrl) {
        this.LoginUrl = LoginUrl;
    }

    // Browser
    private String Browser;

    @JsonProperty("Browser")
    public String getBrowser() {
        return this.Browser;
    }

    @JsonProperty("Browser")
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    // Platform
    private String Platform;

    @JsonProperty("Platform")
    public String getPlatform() {
        return this.Platform;
    }

    @JsonProperty("Platform")
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    // Status
    private String Status;

    @JsonProperty("Status")
    public String getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(String Status) {
        this.Status = Status;
    }

    // Application
    private String Application;

    @JsonProperty("Application")
    public String getApplication() {
        return this.Application;
    }

    @JsonProperty("Application")
    public void setApplication(String Application) {
        this.Application = Application;
    }

    // ClientVersion
    private String ClientVersion;

    @JsonProperty("ClientVersion")
    public String getClientVersion() {
        return this.ClientVersion;
    }

    @JsonProperty("ClientVersion")
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    // ApiType
    private String ApiType;

    @JsonProperty("ApiType")
    public String getApiType() {
        return this.ApiType;
    }

    @JsonProperty("ApiType")
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    // ApiVersion
    private String ApiVersion;

    @JsonProperty("ApiVersion")
    public String getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(String ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

}
