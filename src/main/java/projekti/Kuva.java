package projekti;

//import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author themis1
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Kuva extends AbstractPersistable<Long> {
    
    private String kuvaus;

    @ManyToOne
    private AccountPage accountPage;
    
}
