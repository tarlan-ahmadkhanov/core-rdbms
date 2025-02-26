package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.CbarAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CbarAccountRepository extends CrudRepository<CbarAccount, String> {
}
