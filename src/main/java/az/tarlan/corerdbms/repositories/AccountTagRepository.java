package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.AccountTag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTagRepository extends CrudRepository<AccountTag, Long> {

}
