package az.tarlan.corerdbms.services;

import az.tarlan.corerdbms.domain.AccountTag;
import az.tarlan.corerdbms.enums.AccountTagStatuses;
import az.tarlan.corerdbms.repositories.AccountTagRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountTagService {

    private final AccountTagRepository accountTagRepository;

    public AccountTagService(AccountTagRepository accountTagRepository) {
        this.accountTagRepository = accountTagRepository;
    }

    public AccountTag save(String description) {
        return accountTagRepository.save(new AccountTag(description, AccountTagStatuses.ACTIVE));
    }
}
