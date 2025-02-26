package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.CbarAccount;
import az.tarlan.corerdbms.enums.AccountType;
import az.tarlan.corerdbms.enums.CbarAccountStatuses;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CbarAccountRepositoryTest {

    @Autowired
    CbarAccountRepository cbarAccountRepository;

    @Test
    void createCbarAccountTest() {
        CbarAccount account = cbarAccountRepository.save(new CbarAccount("1001", "Cash accounts in AZN", AccountType.ASSET, CbarAccountStatuses.ACTIVE));
        assertNotNull(account);
    }

}