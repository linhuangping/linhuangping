package com.lhp.Strategy;

public class ConcreteStrategyB extends StrategyClass{
	
	private double moneyRebate=1;
	public ConcreteStrategyB()
	{
		this.moneyRebate=0.8;
	}
	@Override
	public double AlgorithmInterface(double money) {
		// TODO Auto-generated method stub
		return money*moneyRebate;
	}


}
