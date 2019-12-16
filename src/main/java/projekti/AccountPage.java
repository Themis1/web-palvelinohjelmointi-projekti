package projekti;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
public class AccountPage  extends AbstractPersistable<Long> {
    
    // Profiilisivu ja linkki entiteettien välillä   
    @OneToOne       
    private Account account;

    // Lista tälle tyypille kirjoitetuista viesteistä
    @OneToMany
    private List <Message> messages;
    
    // Lista tämän tyypin kuvista
    @OneToMany
    private List <Kuva> kuvat;
    
}
