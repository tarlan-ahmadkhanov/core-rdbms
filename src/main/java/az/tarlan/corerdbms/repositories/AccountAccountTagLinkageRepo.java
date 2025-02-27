package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.AccountAccountTagLinkage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountAccountTagLinkageRepo extends JpaRepository<AccountAccountTagLinkage, Long> {

    Optional<AccountAccountTagLinkage> findByAccountNumberAndTagId(String accountNumber, long tagId);
}
