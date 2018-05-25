/** @version  */
package pex.app.main;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import pex.Interpreter;
import pex.Manager;
import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

/**
 * Open existing interpreter.
 */
public class DoOpen extends Command<Manager> {
    /** Input field. */
    Input<String> _filename;
  /**
   * @param receiver
   */
  public DoOpen(Manager receiver) {
    super(Label.OPEN, receiver);
    _filename = _form.addStringInput(Message.openFile());
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() {
    _form.parse();
    
    try{
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(_filename.value())));
        Interpreter interpreter = (Interpreter)ois.readObject();
        _receiver.setInterpreter(interpreter);
        ois.close();
    } 
    catch(IOException e){e.printStackTrace();} 
    catch(ClassNotFoundException e){_display.popup(Message.fileNotFound());}
    
    
  }

}
