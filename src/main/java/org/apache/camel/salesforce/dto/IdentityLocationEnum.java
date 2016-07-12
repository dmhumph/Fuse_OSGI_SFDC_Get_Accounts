/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist IdentityLocation
 */
public enum IdentityLocationEnum {

    // Attribute
    ATTRIBUTE("Attribute"),
    // SubjectNameId
    SUBJECTNAMEID("SubjectNameId");

    final String value;

    private IdentityLocationEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static IdentityLocationEnum fromValue(String value) {
        for (IdentityLocationEnum e : IdentityLocationEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}