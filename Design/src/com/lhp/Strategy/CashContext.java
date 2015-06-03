package com.lhp.Strategy;

public class CashContext {
	private StrategyClass sc;
	
	public CashContext(StrategyClass sc)
	{
		this.sc=sc;
	} 
	public double GetResult(double money){
		return sc.AlgorithmInterface(money);
	}
}
