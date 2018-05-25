 
package pex.operators;

import pex.Expression;

/**
 * Class for describing the neg operator
 */
public class Neg extends UnaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param argument
   */
  public Neg(Expression argument) {
    super(argument);
  }

  @Override
  public String toString(){
  	return "(neg" + _argument + ")";
  }
  //FIXME (possibly) add other methods: e.g. accept, toString, etc.

}