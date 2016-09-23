package kata1.v1;

import java.util.Date;

public class Kata1V1 {

    public static void main(String[] args) {
        Person persona = new Person("Jeremy Jens",new Date(96,0,22));
        
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años.");
    }
    
}
