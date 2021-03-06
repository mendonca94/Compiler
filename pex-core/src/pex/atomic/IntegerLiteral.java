/*  */
package pex.atomic;

import pex.Value;

/**
 * Class for describing syntactic tree leaves for holding integer values.
 */
public class IntegerLiteral extends Value<Integer> {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param value
   */
  public IntegerLiteral(int value) {
    super(value);
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}
