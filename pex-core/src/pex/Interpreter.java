package pex;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import pex.operators.Program;

public class Interpreter implements Serializable{
    private Map<String,Program> _programs = new HashMap<String,Program>();
    
    public Interpreter(){
    }
    
    public Interpreter(String name, Program program){
        _programs.put(name,program);
    }
    
    public void insertProgram(String name, Program program){
        _programs.put(name,program);
    }
    
    public Program getProgram(String name){
        return _programs.get(name);
    }
    
    public int getSize(){
        return _programs.size();
    }
    
    
} 
