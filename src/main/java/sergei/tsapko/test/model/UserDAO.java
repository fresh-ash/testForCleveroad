package sergei.tsapko.test.model;

import org.springframework.data.repository.CrudRepository;
import sergei.tsapko.test.model.entity.User;

public interface UserDAO extends CrudRepository<User, Long> {
}
