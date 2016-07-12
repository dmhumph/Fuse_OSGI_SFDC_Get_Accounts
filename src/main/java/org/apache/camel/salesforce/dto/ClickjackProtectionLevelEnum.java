/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ClickjackProtectionLevel
 */
public enum ClickjackProtectionLevelEnum {

    // AllowAllFraming
    ALLOWALLFRAMING("AllowAllFraming"),
    // NoFraming
    NOFRAMING("NoFraming"),
    // SameOriginOnly
    SAMEORIGINONLY("SameOriginOnly");

    final String value;

    private ClickjackProtectionLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ClickjackProtectionLevelEnum fromValue(String value) {
        for (ClickjackProtectionLevelEnum e : ClickjackProtectionLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}