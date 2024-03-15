package com.tcs.spring_ioc_container_constructor_injector;

public class Engine {
	private int engineNo;
	private int cc;
	public Engine(int engineNo,int cc) {
		this.engineNo=engineNo;
		this.cc=cc;
	}
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", cc=" + cc + "]";
	}
	
}
