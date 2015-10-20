
package pokemonminigame;

//import你的神奇寶貝母體和子類別所在位置
import Pokemon.Squirtle;
import Pokemon.Charmander;
import Pokemon.Bulbasaur;
import Pokemon.Pokemon;
import java.util.Scanner;

public class PokemonMiniGame {

    //選擇神奇寶貝
    private static void chosePokemon(int chose) {
        Pokemon pokemon; //請替換成你的母體名稱
        switch (chose) {
            case 1: //小火龍
                pokemon = new Charmander(); //替換成你的子類別名稱
                System.out.println("你選擇了"+pokemon.getName());
                startGame(pokemon); //選好神奇寶貝後開始遊戲
                break;
            case 2: //傑尼龜
                pokemon = new Squirtle(); //替換成你的子類別名稱
                System.out.println("你選擇了"+pokemon.getName()); 
                startGame(pokemon); //選好神奇寶貝後開始遊戲
                break;
            case 3: //妙花種子
                pokemon = new Bulbasaur(); //替換成你的子類別名稱
                System.out.println("你選擇了"+pokemon.getName());
                startGame(pokemon); //選好神奇寶貝後開始遊戲
                break;
            default: //重選一次
                System.out.print("選擇錯誤，請重新選擇:");
                Scanner input = new Scanner(System.in);
                chose = input.nextInt(); 
                chosePokemon(chose); //重新選擇
        }
        
    }
    
    private static void startGame(Pokemon pokemon) {
        System.out.println(pokemon.getName()+":"+pokemon.getSound()); //讓神奇寶貝叫
        boolean end=false; //決定是否離開遊戲
        while(true) {
            System.out.println("請輸入數字決定動作：");
            System.out.println("(1)打第一道館");
            System.out.println("(2)查看神奇寶貝");
            System.out.println("(3)離開遊戲");
            Scanner input = new Scanner(System.in);
            int chose = input.nextInt();
            switch (chose) {
                case 1: //打第一道館
                    fighting(pokemon); //打道館囉
                    break;
                case 2: //查看神奇寶貝
                    status(pokemon);
                    break;
                case 3: //離開遊戲
                    end = true;
                    break;
                default: //重選一次
                    System.out.print("選擇錯誤，請重新選擇:");               
            }
            if(end)
                break; //當end=true則套出迴圈
        }
    }
     
    private static void status(Pokemon pokemon) { //查詢各種狀態，傳入的事神奇寶貝母體
        System.out.println("神奇寶貝："+pokemon.getName());
        System.out.println("叫聲："+pokemon.getSound());
        System.out.println("HP："+pokemon.getHp());
        System.out.println("ATK："+pokemon.getAttack());
    }

    private static void fighting(Pokemon pokemon) { //對戰
        Pokemon enemy = new Charmander(); //建立敵人的神奇寶貝
        System.out.println("道館主召喚出了"+enemy.getName());
        Scanner input = new Scanner(System.in);
        boolean end = false; //是否結束對戰
        while(true) {
            System.out.println("請輸入數字決定動作：");
            System.out.println("(1)攻擊");
            System.out.println("(2)藥草(回覆HP50點)");
            System.out.println("(3)查看神奇寶貝");
            System.out.println("(4)逃跑");
            int chose = input.nextInt();
            switch (chose) {
                case 1: //攻擊                   
                    attack("主角","道館主",pokemon,enemy); //主角攻擊
                    attack("道館主","主角",enemy,pokemon); //道館主攻擊
                    end = judge(pokemon.getHp(),enemy.getHp()); //判斷輸贏，傳入血量
                    break;
                case 2: //藥草
                    pokemon.setHp(pokemon.getHp()+50); //回復hp50點
                    System.out.println("回復了50點，目前HP為"+pokemon.getHp()+"點");
                    attack("道館主","主角",enemy,pokemon); //道館主攻擊
                    end = judge(pokemon.getHp(),enemy.getHp());  //判斷輸贏                  
                    break;
                case 3: //查看神奇寶貝
                    System.out.println("我方：");
                    status(pokemon);
                    System.out.println("道館主：");
                    status(enemy);
                    break;
                case 4:
                    System.out.println("你逃跑了！");
                    end = true;
                    break;
                default: //重選一次
                    System.out.print("選擇錯誤，請重新選擇:");               
            }
            
            if (end)
                break;
            
        }
    }
    
    
    private static boolean judge(int pokemon_hp, int enemy_hp) {
        if(enemy_hp <=0) {
            System.out.println("你打敗道館主了！");
            return true;
        }
        else if(pokemon_hp<=0) {
            System.out.println("你輸了！");
            return true;
        }
        else
            return false;
    }
    
    private static void attack(String role, String rival, Pokemon pokemon, Pokemon enemy){
        int damge = pokemon.Attack(); //取得攻擊傷害
        enemy.setHp(enemy.getHp()-damge); 
        System.out.println(role+"的"+pokemon.getName()+"攻擊了"+rival+"的"+enemy.getName()
                            +"造成了"+damge+"點的傷害，"+rival+"的"+enemy.getName()+"血量還剩餘："
                            +enemy.getHp()); //印出訊息
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("歡迎來到神奇寶貝世界：");
        System.out.println("請輸入數字選擇第一隻神奇寶貝：");
        System.out.println("(1)小火龍");
        System.out.println("(2)傑尼龜");
        System.out.println("(3)妙花種子");
        System.out.print(":");
        Scanner input = new Scanner(System.in);
        int chose = input.nextInt();
        chosePokemon(chose);
    }

    
    
}
