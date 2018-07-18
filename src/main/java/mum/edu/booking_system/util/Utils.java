package mum.edu.booking_system.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import mum.edu.booking_system.domain.Address;
import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.domain.User;


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
    
    public static void initialiseUsers(User u1, User u2, User u3) {
    	u1.setAddress("Fairfield");
    	u1.setEmail("ave@yahoo.com");
    	u1.setFirstName("Avenash");
    	u1.setLastName("Kumar");
    	u1.setMobile("3473246775");
    	u1.setPassword("12345");
    	u1.setConfirmPassword("12345");
    	
    	u2.setAddress("Fairfield");
    	u2.setEmail("ave2@yahoo.com");
    	u2.setFirstName("Avenash");
    	u2.setLastName("Kumar");
    	u2.setMobile("3473246775");
    	u2.setPassword("12345");
    	u2.setConfirmPassword("12345");
    	
    	u3.setAddress("Fairfield");
    	u3.setEmail("ave3@yahoo.com");
    	u3.setFirstName("Avenash");
    	u3.setLastName("Kumar");
    	u3.setMobile("3473246775");
    	u3.setPassword("12345");
    	u3.setConfirmPassword("12345");
    }
    public static void initialise(Hotel americlnn, Hotel bestwesternFairfieldInn, Hotel super8) {
    	
    	americlnn.setName("Americlnn");
    	americlnn.setHotelId(1);
    	americlnn.setStars(3.5f);
    	americlnn.setAddress(new Address());
    	americlnn.getAddress().setCity("Fairfield");
    	americlnn.getAddress().setState("IA");
    	Rooms rooma1 = new Rooms();
    	rooma1.setBed(2);
    	rooma1.setRoomsId(1);
    	rooma1.setDescription("2 beds, wifi and breakfast included");
    	rooma1.setCostPerNight(140);
    	Rooms rooma2 = new Rooms();
    	rooma2.setRoomsId(2);
    	rooma2.setBed(1);
    	rooma2.setDescription("1 bed, wifi and breakfast included");
    	rooma2.setCostPerNight(120);
    	Set<Rooms> roomsa = new HashSet<Rooms>();
    	roomsa.add(rooma1);
    	roomsa.add(rooma2);
    	americlnn.setRooms(roomsa);
    	
    	bestwesternFairfieldInn.setName("Best Western Fairfield Inn");
    	bestwesternFairfieldInn.setHotelId(2);
    	bestwesternFairfieldInn.setStars(3.0f);
    	bestwesternFairfieldInn.setAddress(new Address());
    	bestwesternFairfieldInn.getAddress().setCity("Fairfield");
    	bestwesternFairfieldInn.getAddress().setState("IA");
    	Rooms roomb1 = new Rooms();
    	roomb1.setRoomsId(3);
    	roomb1.setBed(2);
    	roomb1.setDescription("VIP suite, wifi and breakfast included");
    	roomb1.setCostPerNight(300);
    	Rooms roomb2 = new Rooms();
    	roomb2.setRoomsId(4);
    	roomb2.setBed(2);
    	roomb2.setDescription("1 bed, wifi and breakfast included");
    	roomb2.setCostPerNight(100);
    	Set<Rooms> roomsb = new HashSet<Rooms>();
    	roomsb.add(roomb1);
    	roomsb.add(roomb2);
    	bestwesternFairfieldInn.setRooms(roomsb);
    	
    	super8.setName("Super 8");
    	super8.setHotelId(3);
    	super8.setStars(3.5f);
    	super8.setAddress(new Address());
    	super8.getAddress().setCity("Fairfield");  	
    	super8.getAddress().setState("IA");
    	Rooms rooms1 = new Rooms();
    	rooms1.setRoomsId(5);
    	rooms1.setBed(2);
    	rooms1.setDescription("2 beds, wifi and breakfast included");
    	rooms1.setCostPerNight(80);
    	Rooms rooms2 = new Rooms(); 
    	rooms2.setRoomsId(6);
    	rooms2.setBed(1);
    	rooms2.setDescription("1 bed, wifi and breakfast included");
    	rooms2.setCostPerNight(63);
    	Set<Rooms> roomss = new HashSet<Rooms>();
    	roomsa.add(rooms1);
    	roomsa.add(rooms2);
    	super8.setRooms(roomss);
    	
    }
}
