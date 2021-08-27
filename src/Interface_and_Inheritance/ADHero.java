package Interface_and_Inheritance;

import Class_Objects.Hero;

public class ADHero extends Hero implements AD{
    @Override
    public void PhysicAttack(){
        System.out.println("进行物理攻击");
    }
}
