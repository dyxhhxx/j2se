package Interface_and_Inheritance;

import Class_Objects.Hero;

public class ADAPHero extends Hero implements AD,AP {
    @Override
    public void PhysicAttack(){
        System.out.println("进行物理攻击");
    }
    @Override
    public void MagicAttack(){
        System.out.println("进行魔法攻击");
    }
}
