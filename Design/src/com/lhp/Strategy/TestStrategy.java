package com.lhp.Strategy;

public class TestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Context context;
//		context=new Context(new ConcreteStrategyA());
//		context.ContextInterface(1000);
//		
//		context=new Context(new ConcreteStrategyB());
//		context.ContextInterface(1000);
//		
//		context=new Context(new ConcreteStrategyC(300,100));
//		context.ContextInterface(1000);
		
		
		CashContext cc;
		char str='t';
		switch(str){
			case 't':
				cc=new CashContext(new ConcreteStrategyB());
				break;
			default :
				cc=new CashContext(new ConcreteStrategyA());
				break;
				
		}
		
		double d=cc.GetResult(1000);
		System.out.println(d);
	}

}
