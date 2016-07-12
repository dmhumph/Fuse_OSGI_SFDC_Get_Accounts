/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CustomObjectType
 */
public enum CustomObjectTypeEnum {

    // Enterprise
    ENTERPRISE("Enterprise"),
    // Light
    LIGHT("Light");

    final String value;

    private CustomObjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CustomObjectTypeEnum fromValue(String value) {
        for (CustomObjectTypeEnum e : CustomObjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}