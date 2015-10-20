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
//小火龍
public class Charmander extends Pokemon{
    final String name = "小火龍";    
    public Charmander() {
        
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getSound() {          
        return "吼吼吼";
    }
}
