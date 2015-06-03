package com.lhp.factory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation operation;
		operation=OperationFactory.createOperation('-');
		operation.set_numberA(90);
		operation.set_numberB(100);
		
		//double d=operation.GetResult();
		System.out.println(operation.GetResult());
	}
	
}
