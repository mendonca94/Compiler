/** @version  */
package pex.app.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import pex.Interpreter;
import pex.Manager;
import pex.operators.Program;
import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

/**
 * Write (save) program to file.
 */
public class DoWriteProgram extends Command<Manager> {
  /** Input field. */
  Input<String> _programName;
  /** Input field. */
  Input<String> _filename;

  /**
   * @param receiver
   */
  public DoWriteProgram(Manager receiver) {
    super(Label.WRITE_PROGRAM, receiver);
    _programName = _form.addStringInput(Message.requestProgramId());
    _filename = _form.addStringInput(Message.programFileName());
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() {
    _form.parse();
    
    Program pg = _receiver.getInterpreterProgram(_programName.value());
    if(pg != null){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(_filename.value() +  ".txt")));
            oos.writeObject(pg);
            oos.close();
        } 
        catch (IOException e){e.printStackTrace();}
    } 
    else {
        _display.popup(Message.noSuchProgram(_programName.value()));
    }
  }

}
