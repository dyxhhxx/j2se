package Interface_and_Inheritance;

import Class_Objects.Hero;

public class APHero extends Hero implements AP,Mortal{
    @Override
    public void MagicAttack(){
        System.out.println("进行物理攻击");
    }
    @Override
    public void die(){
        System.out.println("AD英雄死亡");
    }

}
