package pex.operators;

import pex.Expression;

/**
 * Class for describing the ne operator
 */
public class Ne extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Ne(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(ne" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}