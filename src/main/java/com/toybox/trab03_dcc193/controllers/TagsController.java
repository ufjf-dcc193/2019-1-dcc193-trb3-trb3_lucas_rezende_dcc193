package com.toybox.trab03_dcc193.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.toybox.trab03_dcc193.models.Item;
import com.toybox.trab03_dcc193.models.Tag;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * TagsController
 */
@Controller
@RequestMapping({ "/tags" })
public class TagsController {

    List<Item> ls = new ArrayList<Item>();
    List<Tag> lstags = new ArrayList<Tag>();

    @GetMapping
    public ModelAndView getTodosTags() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("tags_list");
        mv.addObject("tags", ls);
        // mv.addObject("itens", ItensRepository.findAll());
        // mv.addObject("login", IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/cadastrar_tag")
    public ModelAndView cadastrar() {
        Tag tag = new Tag();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("tag_form");
        mv.addObject("tag", tag);
        // mv.addObject("login",IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/editar_tag/{id}")
    public ModelAndView editar(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("tag_form");
        mv.addObject("tag", ls.get(id));
        // mv.addObject("item", ItemRepository.findById(id));
        // mv.addObject("login",IdLogin.idLogin);
        return mv;
    }

    @GetMapping("/excluir_tag/{id}")
    public RedirectView excluir(@PathVariable Integer id) {
        // Item item = ItemRepository.getOne(id);
        // ItemRepository.delete(item);
        return new RedirectView("/tags/");
    }

    @PostMapping(value = "/salvarTag")
    public ModelAndView manter(@Valid Tag tag, BindingResult binding) {
        ModelAndView mv = new ModelAndView();
        if (binding.hasErrors()) {
            mv.setViewName("tags_form");
            mv.addObject("tag", tag);
            // mv.addObject("login", IdLogin.idLogin);
            return mv;
        }
        // ItensRepository.save(item);
        lstags.add(tag);
        // mv.addObject("login",IdLogin.idLogin);
        mv.setViewName("tags_list");
        mv.addObject("tags", lstags);
        return mv;
    }

}