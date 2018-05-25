/** @version  */
package pex.app.main;

import pex.Interpreter;
import pex.Manager;
import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

/**
 * Open a new interpreter.
 */
public class DoNew extends Command<Manager> {
  /** Input field. */
  Input<Boolean> _shouldSave;

  /**
   * @param receiver
   */
  public DoNew(Manager receiver) {
    super(Label.NEW, receiver);
    _shouldSave = _form.addBooleanInput(Message.saveBeforeExit());
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() {
    _form.parse();
    _receiver.doNewInterpreter();
    
  }

}
