package pex.operators;

import pex.Expression;

/**
 * Class for describing the ge operator
 */
public class Ge extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Ge(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(ge" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
} 
