import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<CommandObj> commandList;

        CommandObj helloContainer = new CommandObj<T, R>(hello());
    }

    public static String hello() {
        return "Hello ";
    }

    public String world() {
        return "World";
    }
}