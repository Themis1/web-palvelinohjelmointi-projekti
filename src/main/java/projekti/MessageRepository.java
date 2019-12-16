package projekti;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author themis1
 */

public interface MessageRepository extends JpaRepository<Message, Long> {
    
}
