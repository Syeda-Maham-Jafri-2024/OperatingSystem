import java.util.BitSet;
// --------------------------- OS_Project_Phase1--------------
// ----------------------Instructor : Miss Asma Larik-------------
// Group Member Names:
// Syeda Maham Jafri
// Alliya Parvez
// Sara Ebrahim
// making code changes to the main branch of the repository
public class InstructionSet {
    FlagRegisters flags = new FlagRegisters();
    //Register-Register Instructions
    //NOTE : Need to check zero flag, sign flag and overflow flag.
    public void move(Register r1, Register r2){
        r1.writeregister(r2.readregister());
    }
    public void add(Register r1, Register r2){
        short operand1 = r1.readregister();		             // extract contents of r1 register
        short operand2 = r2.readregister( );				 // extract contents of r2 register
        r1.writeregister((short)(operand1 + operand2));      // add both the contents and write the result down in register r1
      // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void subtract(Register r1, Register r2){
        short operand1 = r1.readregister();		             // extract contents of r1 register
        short operand2 = r2.readregister( );				 // extract contents of r2 register
        r1.writeregister((short)(operand1 - operand2));      // subtract both the contents and write the result down in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void multiply(Register r1, Register r2){
        short operand1 = r1.readregister();		             // extract contents of r1 register
        short operand2 = r2.readregister( );				 // extract contents of r2 register
        r1.writeregister((short)(operand1 * operand2));      // multiply both the contents and write the result down in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void divide(Register r1, Register r2){    // throws arithmetic exception since cant divide by 0
        try {
            short operand1 = r1.readregister();                // extract contents of r1 register
            short operand2 = r2.readregister();                // extract contents of r2 register
            r1.writeregister((short) (operand1 / operand2));   // divide both the contents and write the result down in register r1
            // checking the zero flag, sign flag and overflow flag
            // Converting the result of operation to string so that we can extract the most significant bit
            // using the substring method
            String bin_output =  Integer.toBinaryString(r1.readregister());
            //passing the most significant bit to flag methods/
            flags.zero_flag(bin_output.substring(0,1));
            flags.sign_flag(bin_output.substring(0,1));
            flags.overflow_flag(r1.readregister());
        }
        catch(ArithmeticException e)
        {
            //printing an error statement incase division by zero occurs
            System.out.println("ERROR: Divided by zero operation is not possible");
        }
    }
    public void and(Register r1, Register r2){
        short operand1 = r1.readregister();		             // extract contents of r1 register
        short operand2 = r2.readregister( );				 // extract contents of r2 register
        r1.writeregister((short)(operand1 & operand2));      // ANDing both the contents and write the result down in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void or(Register r1, Register r2){
        short operand1 = r1.readregister();		             // extract contents of r1 register
        short operand2 = r2.readregister( );				 // extract contents of r2 register
        r1.writeregister((short)(operand1 & operand2));      // ORing both the contents and write the result down in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }

    //Register-Imediate Instructions
    public void movi(Register r1, short r2)
    {
        r1.writeregister(r2);							      // copy value r2 to register r1
    }
    public void addi(Register r1, short r2)
    {
        short op1 = r1.readregister( );				          // extract contents of r1 register
        r1.writeregister((short)(op1 + r2));			      // add register r1 value to r2 value and write the result in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void subi(Register r1, short r2)
    {
        short op1 = r1.readregister( );				          // extract contents of r1 register
        r1.writeregister((short)(op1 - r2));			      // subtract register r1 value to r2 value and write the result in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void muli(Register r1, short r2)
    {
        short op1 = r1.readregister( );				          // extract contents of r1 register
        r1.writeregister((short)(op1 * r2));			      // multiply register r1 value to r2 value and write the result in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void divi(Register r1, short r2)
    {
        try {
            short op1 = r1.readregister();                    // extract contents of r1 register
            r1.writeregister((short)(op1 / r2));              // divide r1 register value to r2 value and write the result in register r1
            // checking the zero flag, sign flag and overflow flag
            // Converting the result of operation to string so that we can extract the most significant bit
            // using the substring method
            String bin_output =  Integer.toBinaryString(r1.readregister());
            //passing the most significant bit to flag methods/
            flags.zero_flag(bin_output.substring(0,1));
            flags.sign_flag(bin_output.substring(0,1));
            flags.overflow_flag(r1.readregister());
        }
        catch(ArithmeticException e)
        {
            System.out.println("ERROR: Divided by zero operation is not possible");
        }
    }
    public void andi(Register r1, short r2){
        short op1 = r1.readregister( );				 // extract contents of r1 register
        r1.writeregister((short)(op1 & r2));         // perform bitwise AND operation on register r1 and value r2 and write down the result in register r1.
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void ori(Register r1, short r2){
        short op1 = r1.readregister( );				 // extract contents of r1 register
        r1.writeregister((short)(op1 | r2));         // perform bitwise OR operation on register r1 and value r2 and write down the result in register r1
        // checking the zero flag, sign flag and overflow flag
        // Converting the result of operation to string so that we can extract the most significant bit
        // using the substring method
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }

    //----------------- Memory Instructions -----------------
    public void movl(){

    }
    public void movs(){

    }

    //------------------Single Operand Instructions ------------------
    // Note : Need to check the zero flag,sign flag and carry flag for shift and rotate operations
    // Note: Carry needs to be checked before the operation and the zero and sign bit after the operation

    public void shiftl(Register r1){
        short op1 = r1.readregister( );           // extract the contents of r1 register
        // checking for the carry flag
        String binop1 = Integer.toBinaryString(op1);
        flags.carry_flag(binop1.substring(0,1));

        r1.writeregister((short)(op1 << 1));      // shift the contents towards left and write down the result in register r1
        //checking for sign and zero flag
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));

    }
    public void shiftr(Register r1){
        short op1 = r1.readregister( );           // extract the contents of r1 register
        // checking for the carry flag
        String binop1 = Integer.toBinaryString(op1);
        flags.carry_flag(binop1.substring(0,1));

        r1.writeregister((short)(op1 >> 1));      // shift the contents towards right by 1 bit and write down the result in register r1
        //checking for sign and zero flag
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
    }
    public void rotateL(Register r1){
        short op1 = r1.readregister( );
        // checking for the carry flag
        String binop1 = Integer.toBinaryString(op1);
        flags.carry_flag(binop1.substring(0,1));

        r1.writeregister((short)Integer.rotateLeft(op1,1));
        //checking for sign and zero flag
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
    }
    // bnz 0 jump else donot jump
    public void rotateR(Register r1){
        short op1 = r1.readregister( );
        // checking for the carry flag
        String binop1 = Integer.toBinaryString(op1);
        flags.carry_flag(binop1.substring(0,1));

        r1.writeregister((short)Integer.rotateLeft(op1,1));
        //checking for sign and zero flag
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
    }
    public void increment(Register r1,short val){
        r1.writeregister((short)(r1.value + val));
        // checking the zero and sign flag
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //System.out.println(bin_output);         for checking
       // System.out.print(bin_output.substring(0,1));   for checking
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag((String)bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void decrement(Register r1 , short val){
        r1.writeregister((short)(r1.value - val));
        // checking the zero and sign flag
        String bin_output =  Integer.toBinaryString(r1.readregister());
        //passing the most significant bit to flag methods/
        flags.zero_flag(bin_output.substring(0,1));
        flags.sign_flag(bin_output.substring(0,1));
        flags.overflow_flag(r1.readregister());
    }
    public void push(){
// have not implemented stack in phase 1 as we were not asked to do it
    }
    public void pop(){
// have not implemented stack in phase 1 as we were not asked to do it
    }

    //------------------ No Operand Instrucions -----------
    public void Return(){

    }
    public void noop(){
     // this method performs no operation
    }
    public void end(){
        // method to terminate the whole process
        System.exit(0);
    }


}
