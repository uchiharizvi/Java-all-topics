package java8.functionalinterface;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
