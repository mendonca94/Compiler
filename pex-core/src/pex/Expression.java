package pex;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import pex.Value;

/**
 * An expressions can be evaluated to produce a value.
 */
public abstract class Expression implements Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;
  
  //FIXME (possibly) add other methods: e.g. accept, toString, etc.

}
