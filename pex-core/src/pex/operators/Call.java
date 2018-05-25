package pex.operators;

import pex.Expression;

/**
 * Class for describing the call operator
 */
public class Call extends UnaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param argument
   */
  public Call(Expression argument) {
    super(argument);
  }
  
  @Override
  public String toString(){
  	return "(call" + _argument + ")";
  }
  //FIXME (possibly) add other methods: e.g. accept, toString, etc.

} 
