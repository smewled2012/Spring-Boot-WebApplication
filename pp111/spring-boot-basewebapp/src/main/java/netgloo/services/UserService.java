package netgloo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import netgloo.Repository.UserRepository;
import netgloo.model.User;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	

}
