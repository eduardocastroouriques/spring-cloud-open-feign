package br.com.ouriques.FeignClient.hystrix;

import br.com.ouriques.FeignClient.client.JSONPlaceHolderClient;
import br.com.ouriques.FeignClient.model.Post;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {

    @Override
    public List<Post> getPosts() {
        return Collections.emptyList();
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }
}
