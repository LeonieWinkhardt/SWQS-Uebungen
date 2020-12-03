package com.mycompany.app;

public class Calculator implements ICalculator {

	@Override
	public int additionInteger(int Zahl1, int Zahl2) {
		return Zahl1+Zahl2;
	}

	@Override
	public int subtraktionInteger(int Zahl1, int Zahl2) {
		return Zahl1-Zahl2;
	}

	@Override
	public int multiplikationInteger(int Zahl1, int Zahl2) {
		return Zahl1*Zahl2;
	}

	@Override
	public int divisionInteger(int Zahl1, int Zahl2) {
		return Zahl1/Zahl2;
	}
}
