package projekti;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author themis1
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message extends AbstractPersistable<Long> {
   
    private String message;

    @ManyToOne
    private AccountPage accountPage;

    @ManyToOne
    private Account account;
    
}
