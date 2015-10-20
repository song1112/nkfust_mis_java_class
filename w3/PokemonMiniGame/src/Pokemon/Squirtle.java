package Pokemon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Pokemon.Pokemon;

/**
 *
 * @author song
 */
//傑尼龜
public class Squirtle extends Pokemon{
    final String name = "傑尼龜";
    
    public Squirtle() {
        
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getSound() {   
        
        return "呀呀呀";
    }
}
