/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jul 08 15:39:07 EDT 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ContractFeed
 */
public class QueryRecordsContractFeed extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ContractFeed> records;

    public List<ContractFeed> getRecords() {
        return records;
    }

    public void setRecords(List<ContractFeed> records) {
        this.records = records;
    }
}