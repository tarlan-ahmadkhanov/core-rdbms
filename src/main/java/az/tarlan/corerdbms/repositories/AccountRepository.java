package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
}
