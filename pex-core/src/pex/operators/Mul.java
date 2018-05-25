/*  */
package pex.operators;

import pex.Expression;

/**
 * Class for describing the multiplication ('*') operator
 */
public class Mul extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Mul(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(mul" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}
