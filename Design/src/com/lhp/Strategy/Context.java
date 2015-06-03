package com.lhp.Strategy;

public class Context {
	StrategyClass sc;
	public Context(StrategyClass sc)
	{
		this.sc=sc;
	}
	public void ContextInterface(double money){
		System.out.println(sc.AlgorithmInterface(money));
	}
}
