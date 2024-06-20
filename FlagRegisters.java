import java.util.BitSet;
// --------------------------- OS_Project_Phase1--------------
// ----------------------Instructor : Miss Asma Larik-------------
// Group Member Names:
// Syeda Maham Jafri
// Alliya Parvez
// Sara Ebrahim
public class FlagRegisters {
    private BitSet flag = new BitSet(16);

    public void carry_flag(String msb){
        // using the most significant bit of the result to check this
        if (msb.equals("0"))
        { flag.set(0);}         //setting flag
        else {flag.clear(0);}  // clearing flag
        System.out.println("CarryFlag: " + flag.get(0));
    }
    public void zero_flag(String msb){
        // using the most significant bit of the result to check this
        if (msb.equals("0"))
        { flag.set(1);}          //setting flag
        else {flag.clear(1);}     //clearing flag
        System.out.println("ZeroFlag: " + flag.get(1));
    }
    public void sign_flag(String msb){
        // using the most significant bit of the result to check this
        if (msb.equals("1"))
        { flag.set(2);}               //setting flag
        else {flag.clear(2);}  // clearing flag
        System.out.println("SignFlag: "+ flag.get(2));
    }
    public void overflow_flag(short val){
        if (val >= Math.pow(2,15))
        { flag.set(3);}         //setting flag
        else {flag.clear(3);}          //clearing flag
        System.out.println("OverflowFlag: " + flag.get(3));
    }

}

