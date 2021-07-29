package com.scotia.datamigrationkyc.domain.data.model;


public enum QaCode{
    timeHorizon("timeHorizon", "THO"),
    grossAnnualIncome("grossAnnualIncome", "GAI");
    private final String key;
    private final String value;

    QaCode(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

}
