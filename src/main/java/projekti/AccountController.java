package projekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author themis1
 */

@Controller
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/accounts")
    public String list(Model model) {
        model.addAttribute("accounts", accountRepository.findAll());
        return "accounts";
    }

    @PostMapping("/accounts")
    public String add(@RequestBody Account account) {
        accountRepository.save(account);
        String url = account.getUrl();
        return "redirect:/viewaccount/{url}";
    }
    
    
    @PutMapping("/accounts")
    public String refresh(@RequestParam String username, @RequestParam String name, @RequestParam String url) {
        if (accountRepository.findByUsername(username) == null) {
            return "redirect:/accounts";
        }
        
        Account a = accountRepository.findByUsername(username);
        a.setName(name);
        a.setUrl(url);
        a.setUsername(username);
        accountRepository.save(a);
        return "redirect:/viewaccount/{url}";
    }
    
    @GetMapping("/viewaccount/{url}")
    @ResponseBody
    public Account getAccount(@PathVariable String url) {
        return accountRepository.findByUrl(url);
        //return "viewaccount/{url}";
    }
}
