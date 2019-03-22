package MapFunc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public  static<T, R> ArrayList<R> map(ArrayList<T> arrayList, Function<T, R> object) {
        return (ArrayList<R>) arrayList.stream().map(object).collect(Collectors.toList());

    }
}
