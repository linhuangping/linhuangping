package com.lhp.Strategy;

public class ConcreteStrategyC extends StrategyClass{
	private double moneyCondition=0;
	private double moneyReturn=0;
	public ConcreteStrategyC(double moneyCondition,double moneyReturn)
	{
		this.moneyCondition=moneyCondition;
		this.moneyReturn=moneyReturn;
	}
	@Override
	public double AlgorithmInterface(double money) {
		// TODO Auto-generated method stub
		double result=money;
		if(money>=moneyCondition)
		{
			result=money-((int)(money/moneyCondition)*moneyReturn);
		}
		return result;
	}


}
