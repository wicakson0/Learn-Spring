import java.util.function.Function;

public class CommandObj<T, R> {
    private Function<T, R> function;

    public CommandObj(Function<T, R> function) {
        this.function = function;
    }

    public Function<T, R> getFunction() {
        return function;
    }

    public void setFunction(Function<T, R> function) {
        this.function = function;
    }

    public R executeFunction(T input) {
        return function.apply(input);
    }
}
