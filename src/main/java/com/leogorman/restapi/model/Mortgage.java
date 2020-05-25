package com.leogorman.restapi.model;

public class Mortgage {

    private final int userId;
    private final int mortgageId;
    private final Double interestRate;
    private final Double balancePaid;
    private final Double balanceRemaining;

    public Mortgage(int userId, int mortgageId, Double interestRate, Double balancePaid, Double balanceRemaining) {
        this.userId = userId;
        this.mortgageId = mortgageId;
        this.interestRate = interestRate;
        this.balancePaid = balancePaid;
        this.balanceRemaining = balanceRemaining;
    }

    public int getUserId() {
        return this.userId;
    }
    public int getMortgageId() {
        return this.mortgageId;
    }
    public Double getInterestRate() {
        return this.interestRate;
    }
    public Double getBalancePaid() {
        return this.balancePaid;
    }
    public Double getBalanceRemaining() {
        return this.balanceRemaining;
    }
}


