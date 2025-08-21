public class clgstd extends std {
    public int roll_no;
    public clgstd(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll(){
        System.out.println("Roll no is"+roll_no);
    }

}
