package function.binaryFunction;

import function.Function;

public class Add extends BinaryFunction {

	public Add(Function a, Function b) {
		setOperator1(a);
		setOperator2(b);
	}
	
	@Override
	public Function derivative() throws ArithmeticException {
		return new Add(getOperator1().derivative(), getOperator2().derivative());
	}

	@Override
	public String toString() {
		return getOperator1().toString() + "+" + getOperator2().toString();
	}

}
