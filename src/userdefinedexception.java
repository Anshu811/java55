//step-2
public class userdefinedexception {
    public void validate(int age)throws Invalidageexception{
        if(age<18)
        { throw new Invalidageexception("Not eligible to vote age less than 18");
        }
        else System.out.println("eligible to vote");
    }
}
