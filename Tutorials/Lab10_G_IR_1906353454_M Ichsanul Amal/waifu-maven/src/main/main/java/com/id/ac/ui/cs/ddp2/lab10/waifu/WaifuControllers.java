package com.id.ac.ui.cs.ddp2.lab10.waifu;

import com.id.ac.ui.cs.ddp2.lab10.waifu.model.Waifu;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WaifuControllers {
    List<Waifu> listWaifu = new ArrayList<Waifu>();

    // Mapping awal page
    @GetMapping("/")
    public String index(Model model) {
        return "index"; // html
    }

    // Mapping page tambah waifu setelah tombol "tambah waifu" ditekan di index
    @GetMapping("/tambah-waifu")
    public String addWaifu(Model model) {
        model.addAttribute("waifu", new Waifu());
        return "tambah-waifu"; // html
    }

    // Request field dari page tambah waifu
    @PostMapping("/tambah-waifu")
    public String postWaifu(@ModelAttribute Waifu waifu) {
        listWaifu.add(waifu); //menambahkan waifu ke listWaifu setelah form tambah waifu terisi
        return "result"; // menampilkan notif setelah berhasil ditambahkan 
    }

    // Page untuk menampilkan seluruh listWaifu
    @GetMapping("/list-waifu")
    public String listWaifu(Model model) {
        model.addAttribute("listWaifu", listWaifu); // "listWaifu" terdapat pada html
        return "list-waifu"; //html 
    }

}