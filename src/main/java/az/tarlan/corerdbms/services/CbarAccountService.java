package az.tarlan.corerdbms.services;

import az.tarlan.corerdbms.enums.AccountType;
import az.tarlan.corerdbms.enums.CbarAccountStatuses;
import az.tarlan.corerdbms.repositories.CbarAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class CbarAccountService {

    private final CbarAccountRepository cbarAccountRepository;

    public CbarAccountService(CbarAccountRepository cbarAccountRepository) {
        this.cbarAccountRepository = cbarAccountRepository;
    }

    public boolean create(String cbarAccountNumber, String cbarAccountDescription, AccountType accountType) {

        az.tarlan.corerdbms.domain.CbarAccount cbarAccount = new az.tarlan.corerdbms.domain.CbarAccount(
                cbarAccountNumber,
                cbarAccountDescription,
                accountType,
                CbarAccountStatuses.ACTIVE
        );

        try {
            cbarAccountRepository.save(cbarAccount);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean update(az.tarlan.corerdbms.domain.CbarAccount cbarAccount) {

        try {
            cbarAccountRepository.save(cbarAccount);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
