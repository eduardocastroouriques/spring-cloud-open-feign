package br.com.ouriques.FeignClient.controller;

import br.com.ouriques.FeignClient.model.Post;
import br.com.ouriques.FeignClient.service.impl.JSONPlaceHolderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/teste")
public class TestController {

    @Autowired
    private JSONPlaceHolderServiceImpl service;

    @GetMapping("/{id}")
    public Post getSpanishGreetingById(@PathVariable("id") final Long id) {
        return service.getPostById(id);
    }

}
