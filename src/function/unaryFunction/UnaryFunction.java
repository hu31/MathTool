package function.unaryFunction;

import function.Function;

public abstract class UnaryFunction extends Function {
	private Function operator1;
	
	public UnaryFunction() {
		operator1 = null;
	}

	public UnaryFunction(Function operator1) {
		this.operator1 = operator1;
	}
	
	public Function getOperator1() {
		return operator1;
	}

	public void setOperator1(Function operator1) {
		this.operator1 = operator1;
	}
}
