package mock;

import java.util.stream.Stream;

public class DoorPanel {
    public Boolean flag = false;
    public Boolean close() {
        Stream.of("East Door", "West Door", "North Door", "South Door")
                .forEach((door) -> {

                    System.out.println(door + "is closed");
                });
        flag = true;
        return false;
    }
}

