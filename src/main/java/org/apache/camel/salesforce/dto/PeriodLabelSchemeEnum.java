/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PeriodLabelScheme
 */
public enum PeriodLabelSchemeEnum {

    // Custom
    CUSTOM("Custom"),
    // NumberByQuarter
    NUMBERBYQUARTER("NumberByQuarter"),
    // NumberByYear
    NUMBERBYYEAR("NumberByYear"),
    // StandardMonths
    STANDARDMONTHS("StandardMonths");

    final String value;

    private PeriodLabelSchemeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PeriodLabelSchemeEnum fromValue(String value) {
        for (PeriodLabelSchemeEnum e : PeriodLabelSchemeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}