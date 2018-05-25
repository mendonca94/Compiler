/** @version  */
package pex.app;

import static pt.tecnico.po.ui.Dialog.IO;

import pex.operators.Program;
import pex.Manager;
import pex.Parser;
import pex.ParserException;
import pex.app.main.MainMenu;
import pt.tecnico.po.ui.Menu;

import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * This is a sample client for the expression evaluator.
 * It uses a text-based user interface.
 */
public class App {
  /**
   * @param args
   */
  public static void main(String[] args) {
  
    Manager manager = new Manager();
    Program pg = new Program();
    
    String datafile = System.getProperty("import"); //$NON-NLS-1$
    if (datafile != null) {
      try {
      Parser parser = new Parser();
      
      parser.parseProgramFile(datafile);
        
      } catch (ParserException e) {
        // no behavior described: just present the problem
        e.printStackTrace();
      }
    }

    Menu menu = new MainMenu(manager);
    menu.open();
    
    IO.close();
  }

}
