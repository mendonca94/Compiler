 
package pex.operators;

import pex.Expression;

/**
 * Class for describing the set operator
 */
public class Set extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Set(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(set" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}