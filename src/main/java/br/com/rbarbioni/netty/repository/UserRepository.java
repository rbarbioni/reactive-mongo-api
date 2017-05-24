package br.com.rbarbioni.netty.repository;

import br.com.rbarbioni.netty.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by renan on 23/05/17.
 */

public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
