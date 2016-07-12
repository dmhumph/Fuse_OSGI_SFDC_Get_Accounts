/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type InstalledMobileApp
 */
public class QueryRecordsInstalledMobileApp extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<InstalledMobileApp> records;

    public List<InstalledMobileApp> getRecords() {
        return records;
    }

    public void setRecords(List<InstalledMobileApp> records) {
        this.records = records;
    }
}