import java.util.Random;

class main {

    public static void main(String args[]) {
        PokemonMonther mom = new PokemonMonther();
        mom.getSound();
        slime(mom.getAttack());
    }
    
    public static void slime(int atk) {
        Random rand = new Random();
        int slime = 1000;
        for (int i=0;i<10;i++) {  //打史萊姆10下的迴圈
            int damage = atk*rand.nextInt(11); //儲存傷害值
            slime -= damage;
            System.out.println("攻擊造成了"+damage+"點的傷害，"+
                               "史萊姆的血剩餘"+slime);
        }
        if (slime>0) 
            System.out.println("你連史萊姆都打不倒像話嗎?");
        else 
            System.out.println("死了");
            
    }

}
