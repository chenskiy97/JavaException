package lecture002;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex004 {
    public static void main(String[] args) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
