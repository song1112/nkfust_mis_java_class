package Pokemon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author song
 */
//妙花種子
public class Bulbasaur extends Pokemon{
    final String name = "妙花種子";
    public Bulbasaur() {
        
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getSound() {   
        
        return "哇哇哇";
    } 
   
}
