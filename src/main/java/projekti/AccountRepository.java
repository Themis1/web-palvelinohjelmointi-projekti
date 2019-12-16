package projekti;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author themis1
 */

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
    Account findByNimi(String nimi);
    Account findByUrli(String urli);
}
