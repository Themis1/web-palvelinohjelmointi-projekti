package projekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author themis1
 */

@Controller
public class KuvaController {

    @Autowired
    KuvaRepository kuvaRepository;    
    
    @GetMapping("/kuvat")
    public String list(Model model) {
        model.addAttribute("accounts", kuvaRepository.findAll());
        return "kuvat";
    }
    
    @PostMapping("/kuvat")
    public String add(@RequestBody Kuva kuva) {
        kuvaRepository.save(kuva);
        return "kuvat";
    }
}
