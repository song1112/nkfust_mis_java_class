package Pokemon;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Random;

/**
 *
 * @author song
 */
public class Pokemon {
    final String name = "神奇寶貝";
    Random rand = new Random();
    private int attack;
    private int hp; 
    
    public Pokemon() {
        attack = rand.nextInt(11)+10;
        hp = rand.nextInt(101)+500;
    }
    
    public Pokemon(int hp,int attack) {
        this.hp = (rand.nextInt(3)+1)*hp;
        this.attack = (rand.nextInt(3)+1)*attack;        
    }    
    
    public String getSound() {     
        return "嗷嗷嗷";
    }  
    
    public int getAttack() {
        return attack;
    }   
    
    public void setAttack(int attack) {
        this.attack = attack;
    }  
    
    public void setHp(int hp) {
        this.hp = hp;
    }  
    
    public int getHp() {
        return hp;
    }
    
    public String getName() {
        return name;
    }
    
    public int Attack() {
        return rand.nextInt(5)*attack;
    }
}
