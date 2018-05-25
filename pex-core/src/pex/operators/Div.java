package pex.operators;

import pex.Expression;

/**
 * Class for describing the div ('/') operator
 */
public class Div extends Mul {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Div(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(div" + _first + "" + _second + ")";
  }  

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
} 
