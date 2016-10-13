package com.example.teststrategy;

public class Context {
	private IStrategyTravel strategy;
	public Context(IStrategyTravel strategy){
		this.strategy=strategy;
	}
	
	public void opreate(){
		this.strategy.operate();
	}
	
}
