//public interface Calculator {
//    String calculate(double weight, double height);
//    String interpret(String bmi);
//}
public interface Calculator<T> {
    T calculate(double ...a);
    String interpret(T paramToInterpret);
}
