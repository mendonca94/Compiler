package pex;

import pex.operators.Program;

public class Manager{
    private Interpreter _interpreter;
    
    public Manager(){
        _interpreter = new Interpreter();
    }
    
    public void doNewInterpreter(){
        _interpreter = new Interpreter();
    }
    
    public Interpreter getInterpreter(){
        return _interpreter;
    }
    
    public void setInterpreter(Interpreter interpreter){
        _interpreter = interpreter;
    }
    
    public Program getProgram(String name){
        return _interpreter.getProgram(name);
    }
    
    public void setProgram(String name){
        
    }
} 
