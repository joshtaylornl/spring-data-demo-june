package ca.nl.cna.java3.springdatademo;

import ca.nl.cna.java3.springdatademo.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository for User Data Access Object
 * This object will be Auto Implemented by Spring
 * @author Josh
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
