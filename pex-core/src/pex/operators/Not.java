/*  */
package pex.operators;

import pex.Expression;

/**
 * Class for describing the negation operator
 */
public class Not extends UnaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param argument
   */
  public Not(Expression argument) {
    super(argument);
  }
  
  @Override
  public String toString(){
  	return "(not" + _argument + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.

}
