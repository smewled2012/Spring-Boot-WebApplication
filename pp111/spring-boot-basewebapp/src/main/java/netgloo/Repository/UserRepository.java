package netgloo.Repository;

import org.springframework.data.repository.CrudRepository;

import netgloo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
}
