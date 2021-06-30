package id.ac.ui.cs.ddp2.lab10.waifu;

import id.ac.ui.cs.ddp2.lab10.waifu.model.Waifu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WaifuControllers {

    @GetMapping(value="/")
    public String index() {
        return "index";
    }

    @GetMapping("/tambah-waifu")
    public String addWaifu(Model model) {
        //TODO: complete
        return "tambah-waifu";
    }

    @PostMapping("/tambah-waifu")
    public String postWaifu(@ModelAttribute Waifu waifu) {
        //TODO: Complete
    }

    @GetMapping("/list-waifu")
    public String daftarDonatur(Model model) {
        //TODO: Complete
    }

}