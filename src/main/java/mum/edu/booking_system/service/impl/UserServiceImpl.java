package mum.edu.booking_system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.domain.User;
import mum.edu.booking_system.domain.repository.UserRepository;
import mum.edu.booking_system.service.UserService;
import mum.edu.booking_system.util.Utils;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}


	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User findByUserEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}
	
	@Override
	public User findByUserEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public void initialiseUsersInDatabase() {
		 
	    User u1 = new User();
	    User u2 = new User();
	    User u3 = new User();
	 	Utils.initialiseUsers(u1, u2, u3);
	 	save(u1);
	 	save(u2);
	 	save(u3);	
	}
}
