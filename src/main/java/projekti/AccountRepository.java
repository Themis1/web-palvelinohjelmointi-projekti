package projekti;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author themis1
 */

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
    Account findByName(String name);
    Account findByUrl(String url);
}
