package Day_2025_11_17;


import java.time.*;
import java.util.Optional;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
    default void welcome(){
        System.out.println("hello");
    }
}
public class Try1 {
    public static void main(String[] args) {
//        System.out.println("hai");
//        // implementing interface MyFunctionalInterface
//        MyFunctionalInterface objMFI = ()->{
//            System.out.println("mfi");
//        };
//
//        objMFI.myMethod();
//        objMFI.welcome();

//        Optional<String> name = Optional.ofNullable(null);
//        //Optional<String> name;
//        name.ifPresent(n -> System.out.println(n.toUpperCase()));
//
//        LocalDate currentDate = LocalDate.now();
//        System.out.println(currentDate);
//
//        LocalTime currentTime = LocalTime.now();
//        System.out.println(currentTime);
//
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        System.out.println(currentDateTime);

//        Instant instant = Instant.now();
//        ZonedDateTime istTime = instant.atZone(ZoneId.of("Asia/Kolkata"));
//        System.out.println(istTime);


        Instant start = Instant.now();
        // Some computation or operation

        
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration);

    }
}

