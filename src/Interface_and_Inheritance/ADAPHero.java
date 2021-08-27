//多态练习
package Interface_and_Inheritance;

import Class_Objects.Hero;

public class ADAPHero extends Hero implements AD,AP,Mortal {
    @Override
    public void PhysicAttack(){
        System.out.println("进行物理攻击");
    }
    @Override
    public void MagicAttack(){
        System.out.println("进行魔法攻击");
    }
    @Override
    public void die(){
        System.out.println("ADAP英雄死亡");
    }

    public static void main(String[] args) {
        Hero Garen=new Hero();
        ADHero a=new ADHero("teemo");
        APHero b=new APHero();
        ADAPHero c=new ADAPHero();
        //利用类的多态（多态：同一种类型，调用同一种方法，却能呈现不同的状态）
        Garen.kill(a);
        Garen.kill(b);
        Garen.kill(c);
    }
}
