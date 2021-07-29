package com.scotia.datamigrationkyc.domain.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "kyc_db2")
public class Kyc {

    @Id
    @GeneratedValue
    @Column(name = "kyc_id")
    private Long kycId;
    @Column(name = "investor_profile")
    private Long investorProfile;
    @Column(name = "time_horizon")
    private Long timeHorizon;
    @Column(name = "investor_objectives")
    private Long investorObjectives;
    @Column(name = "risk_profile")
    private Long riskProfile;
    @Column(name = "networth")
    private Long netWorth;
    @Column(name = "gross_annual_income")
    private Long grossAnnualIncome;

    public Kyc() {
    }

    public Long getKycId() {
        return kycId;
    }

    public void setKycId(Long kycId) {
        this.kycId = kycId;
    }

    public Long getInvestorProfile() {
        return investorProfile;
    }

    public void setInvestorProfile(Long investorProfile) {
        this.investorProfile = investorProfile;
    }

    public Long getTimeHorizon() {
        return timeHorizon;
    }

    public void setTimeHorizon(Long timeHorizon) {
        this.timeHorizon = timeHorizon;
    }

    public Long getInvestorObjectives() {
        return investorObjectives;
    }

    public void setInvestorObjectives(Long investorObjectives) {
        this.investorObjectives = investorObjectives;
    }

    public Long getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(Long riskProfile) {
        this.riskProfile = riskProfile;
    }

    public Long getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Long netWorth) {
        this.netWorth = netWorth;
    }

    public Long getGrossAnnualIncome() {
        return grossAnnualIncome;
    }

    public void setGrossAnnualIncome(Long grossAnnualIncome) {
        this.grossAnnualIncome = grossAnnualIncome;
    }
}