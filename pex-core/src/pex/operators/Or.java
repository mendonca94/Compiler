 
package pex.operators;

import pex.Expression;

/**
 * Class for describing the or operator
 */
public class Or extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Or(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(or" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}