/*  */
package pex.operators;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import pex.Parser;
import pex.Expression;

/**
 * Class for describing programs.
 */
public class Program implements Serializable {

    private ArrayList<Expression> _expressions = new ArrayList<Expression>();
    
    private String _name;
    
    public Program(){
    }
    
    public Program(String name){
        _name = name;
    }
    
    public Program(Expression expressions, String name){
        _name = name;
    }
    
    public void setName(String name){
        _name = name;
    }
    
    public String getName(){
        return _name;
    }
    
    public void add(Expression e){
        _expressions.add(e);
    }
    
    public Expression getExpression(int index){
        return _expressions.get(index);
    }
    
}