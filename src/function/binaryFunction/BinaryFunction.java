package function.binaryFunction;

import function.Function;

public abstract class BinaryFunction extends Function {
	private Function operator1;
	private Function operator2;

	public BinaryFunction() {
		operator1 = null;
		operator2 = null;
	}

	public BinaryFunction(Function operator1, Function operator2) {
		super();
		this.operator1 = operator1;
		this.operator2 = operator2;
	}

	public Function getOperator1() {
		return operator1;
	}

	public void setOperator1(Function operator1) {
		this.operator1 = operator1;
	}

	public Function getOperator2() {
		return operator2;
	}

	public void setOperator2(Function operator2) {
		this.operator2 = operator2;
	}	
	
}
