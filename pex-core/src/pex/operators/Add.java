/*  */
package pex.operators;

import pex.Expression;

/**
 * Class for describing the sum ('+') operator
 */
public class Add extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Add(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
    return "(add" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}
