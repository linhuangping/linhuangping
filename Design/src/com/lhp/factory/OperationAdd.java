package com.lhp.factory;

public class OperationAdd extends Operation {

	@Override
	public double GetResult() {
		// TODO Auto-generated method stub
		double result=0;
		result=get_numberA()+get_numberB();
		return result;
	}

}
