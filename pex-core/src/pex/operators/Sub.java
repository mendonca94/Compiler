package pex.operators;

import pex.Expression;

/**
 * Class for describing the sub ('-') operator
 */
public class Sub extends Add {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Sub(Expression first, Expression second) {
    super(first, second);
  }
  
  @Override
  public String toString(){
  	return "(sub" + _first + "" + _second + ")";
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
} 
