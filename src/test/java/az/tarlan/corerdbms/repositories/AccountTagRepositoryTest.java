package az.tarlan.corerdbms.repositories;

import az.tarlan.corerdbms.domain.AccountTag;
import az.tarlan.corerdbms.enums.AccountTagStatuses;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountTagRepositoryTest {

    @Autowired
    AccountTagRepository accountTagRepository;

    @Test
    void testSaveNewAccountTag() {

        AccountTag accountTag = new AccountTag("Test tag", AccountTagStatuses.ACTIVE);

        AccountTag newAccountTag = accountTagRepository.save(accountTag);

        assertNotNull(newAccountTag.getId());

    }

}