package pex.operators;

import pex.Expression;

/**
 * Class for describing the lt operator
 */
public class Lt extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Lt(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(lt" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}