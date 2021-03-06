/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Method
 */
public enum MethodEnum {

    // HttpDelete
    HTTPDELETE("HttpDelete"),
    // HttpGet
    HTTPGET("HttpGet"),
    // HttpHead
    HTTPHEAD("HttpHead"),
    // HttpPatch
    HTTPPATCH("HttpPatch"),
    // HttpPost
    HTTPPOST("HttpPost"),
    // HttpPut
    HTTPPUT("HttpPut");

    final String value;

    private MethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
        for (MethodEnum e : MethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
