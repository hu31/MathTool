package function.binaryFunction;

import function.Function;

public class Substract extends BinaryFunction {

	public Substract(Function derivative, Function derivative2) {
		setOperator1(derivative);
		setOperator2(derivative2);
	}

	@Override
	public Function derivative() throws ArithmeticException {
		return new Substract(getOperator1().derivative(), getOperator2().derivative());
	}

	@Override
	public String toString() {
		return getOperator1().toString() + "-" + getOperator2().toString();
	}

}
