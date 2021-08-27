package Interface_and_Inheritance;

import Class_Objects.Hero;

public class Support extends Hero implements Healer{
    @Override
    public void heal(){
        System.out.println("进行治疗");
    }
}
