public interface Calculator<T> {
    T calculate(double ...a);
    String interpret(T paramToInterpret);
}
