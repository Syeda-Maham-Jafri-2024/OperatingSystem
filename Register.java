import java.util.BitSet;

public class Register {
    public String name;
    public short value;


    public String toString() //toString method for printing the details of the register
    {
        return "Register(" + "name= " + name + ", value(decimal)= " + Short.toUnsignedInt(value) + ", value(hex)= " + Integer.toHexString(value) + "}";
    }

    public short readregister(){
     // methods to read the content of the register
        return this.value;
    }
    //method to store/write down the contents in the register
    public void writeregister(short val){
        this.value = val ;
    }
}
