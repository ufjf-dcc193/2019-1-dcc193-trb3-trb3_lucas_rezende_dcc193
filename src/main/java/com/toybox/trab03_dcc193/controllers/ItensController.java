package com.toybox.trab03_dcc193.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.toybox.trab03_dcc193.models.Item;
import com.toybox.trab03_dcc193.models.Tag;

@Controller
@RequestMapping({ "/itens" })
public class ItensController {

    List<Item> ls = new ArrayList<Item>();
    List<Tag> lstags = new ArrayList<Tag>();

    @Autowired
    // private ItensRepository avaliadorRepository;

    @GetMapping
    public ModelAndView getTodosItens() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("itens_list");
        mv.addObject("itens", ls);
        // mv.addObject("itens", ItensRepository.findAll());
        // mv.addObject("login", IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/get_itens_tags/{id}")
    public ModelAndView getTagsId() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("itens_tags_list");
        mv.addObject("tags", lstags);
        // mv.addObject("itens", ItensRepository.findAll());
        // mv.addObject("login", IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/cadastrar_item")
    public ModelAndView cadastrar() {
        Item item = new Item();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("itens_form");
        mv.addObject("item", item);
        // mv.addObject("login",IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/editar_item/{id}")
    public ModelAndView editar(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("item_form");
        mv.addObject("item", ls.get(id));
        // mv.addObject("item", ItemRepository.findById(id));
        // mv.addObject("login",IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/excluir_item/{id}")
    public RedirectView excluir(@PathVariable Integer id) {
        // Item item = ItemRepository.getOne(id);
        // ItemRepository.delete(item);
        return new RedirectView("/itens/");
    }

    @PostMapping(value = "/salvarItem")
    public ModelAndView manter(@Valid Item item, BindingResult binding) {
        ModelAndView mv = new ModelAndView();
        if (binding.hasErrors()) {
            mv.setViewName("itens_form");
            mv.addObject("item", item);
            // mv.addObject("login", IdLogin.idLogin);
            return mv;
        }
        // ItensRepository.save(item);
        ls.add(item);
        // mv.addObject("login",IdLogin.idLogin);
        mv.setViewName("itens_list");
        mv.addObject("itens", ls);
        return mv;
    }

}