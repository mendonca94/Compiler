/** @version  */
package pex.app.evaluator;

import pex.app.BadExpressionException;
import pex.app.BadPositionException;
import pex.Interpreter;
import pex.operators.Program;
import pt.tecnico.po.ui.DialogException;
import pt.tecnico.po.ui.Input;

/**
 * Replace expression in program.
 */
public class DoReplaceExpression extends ProgramCommand {
  /** Input field. */
  Input<Integer> _position;

  /** Input field. */
  Input<String> _description;

  /**
   * @param interpreter
   * @param receiver
   */
  public DoReplaceExpression(Interpreter interpreter, Program receiver) {
    super(Label.REPLACE_EXPRESSION, interpreter, receiver);
    _position = _form.addIntegerInput(Message.requestPosition());
    _description = _form.addStringInput(Message.requestExpression());
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() throws DialogException {
    //FIXME implement
  }
}
