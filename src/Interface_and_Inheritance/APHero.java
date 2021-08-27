package Interface_and_Inheritance;

import Class_Objects.Hero;

public class APHero extends Hero implements AP,Mortal{
    @Override
    public void MagicAttack(){
        System.out.println("进行魔法攻击");
    }
    @Override
    public void die(){
        System.out.println("AP英雄死亡");
    }
}
