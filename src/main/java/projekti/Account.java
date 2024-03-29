package projekti;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author themis1
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account extends AbstractPersistable<Long> {
    
    // Profiilisivu
    @OneToOne       
    private AccountPage accountPage;
    
    // Tämän tyypin kirjoittamat viestit
    @OneToMany
    private List <Message> messages;

    private String username;
    private String nimi;
    private String urli;
    private String password;
}
