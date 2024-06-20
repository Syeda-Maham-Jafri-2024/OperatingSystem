import java.util.Stack;
// --------------------------- OS_Project_Phase1--------------
// ----------------------Instructor : Miss Asma Larik-------------
// Group Member Names:
// Syeda Maham Jafri
// Alliya Parvez
// Sara Ebrahim
public class FixedStackSize<T> extends Stack<T> {
    private int stacksize;

    FixedStackSize( byte size){
        this.stacksize = size;
    }
}
