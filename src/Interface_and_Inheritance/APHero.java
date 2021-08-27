package Interface_and_Inheritance;

import Class_Objects.Hero;

public class APHero extends Hero implements AP{
    @Override
    public void MagicAttack(){
        System.out.println("进行魔法攻击");
    }
}
