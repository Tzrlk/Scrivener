package nz.co.aetheric.scrivener.user;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserDao extends CrudRepository<UserBean, Long> {
}
