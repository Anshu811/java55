public class myexception {
    public static void main(String[] args) {
        userdefinedexception udf=new userdefinedexception();
        try{
            udf.validate(19);
            udf.validate(12);

        }
        catch(Invalidageexception e){
            System.out.println(e.getMessage());
        }

    }
}
