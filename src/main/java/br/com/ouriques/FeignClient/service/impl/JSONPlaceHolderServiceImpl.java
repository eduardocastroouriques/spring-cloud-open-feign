package br.com.ouriques.FeignClient.service.impl;

import br.com.ouriques.FeignClient.client.JSONPlaceHolderClient;
import br.com.ouriques.FeignClient.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JSONPlaceHolderServiceImpl {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    public Post getPostById(Long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }
}
