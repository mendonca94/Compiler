package pex.operators;

import pex.Expression;

/**
 * Class for describing the mod ('%') operator
 */
public class Mod extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Mod(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(mod" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}