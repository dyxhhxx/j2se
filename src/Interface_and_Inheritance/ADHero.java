package Interface_and_Inheritance;

import Class_Objects.Hero;

public class ADHero extends Hero implements AD,Mortal{
    @Override
    public void PhysicAttack(){
        System.out.println("进行物理攻击");
    }
    @Override
    public void die(){
        System.out.println("AD英雄死亡");
    }
    public ADHero(String name){
        //super相当于this的用法，代表父类
        super(name);
        System.out.println("ADHero的构造方法");
    }
}
