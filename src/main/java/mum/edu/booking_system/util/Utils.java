package mum.edu.booking_system.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

import mum.edu.booking_system.domain.Address;
import mum.edu.booking_system.domain.Hotel;


public class Utils {
    public static <T> String toCsv(Collection<T> coll, Function<T, CharSequence> keyMapper) {
        return coll.stream()
                .map(keyMapper)
                .collect(Collectors.joining(", "));
    }

    public static String capitalize(String s) {
        if (s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String capitalizeWords(String s) {
        return Arrays.stream(s.split("\\s"))
                .map(Utils::capitalize)
                .collect(Collectors.joining(" "));
    }
    
    public static void initialise(Hotel americlnn, Hotel bestwesternFairfieldInn, Hotel super8) {
    	
    	americlnn.setName("Americlnn");
    	americlnn.setStars(3.5f);
    	americlnn.setAddress(new Address());
    	americlnn.getAddress().setCity("Fairfield");
    	americlnn.getAddress().setState("IA");
    	
    	bestwesternFairfieldInn.setName("Best Western Fairfield Inn");
    	bestwesternFairfieldInn.setStars(3.0f);
    	bestwesternFairfieldInn.setAddress(new Address());
    	bestwesternFairfieldInn.getAddress().setCity("Fairfield");
    	bestwesternFairfieldInn.getAddress().setState("IA");
    	
    	super8.setName("Super 8");
    	super8.setStars(3.5f);
    	super8.setAddress(new Address());
    	super8.getAddress().setCity("Fairfield");
    	super8.getAddress().setState("IA");
    	
    }
}
