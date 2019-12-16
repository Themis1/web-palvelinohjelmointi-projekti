package projekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author themis1
 */

@Controller
public class MessageController {
    
    @Autowired
    MessageRepository messageRepository;
    
    @GetMapping("/messages")
    public String list(Model model) {
        model.addAttribute("messages", messageRepository.findAll());
        return "messages";
    }

    @PostMapping("/messages")
    public String add(@RequestBody Message message) {
        messageRepository.save(message);
        return "messages";
    }
    
}
