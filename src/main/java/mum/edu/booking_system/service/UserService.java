package mum.edu.booking_system.service;



import java.util.List;

import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.domain.User;

public interface UserService {
	
	public void save(User user);
	public List<User> findAll();
	public User findByUserEmail(String email);
	public User findByUserEmailAndPassword(String email, String password);
	public void initialiseUsersInDatabase();

}