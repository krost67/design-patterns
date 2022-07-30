package com.podlasenko.example.factory;

import com.podlasenko.example.model.BlogPost;
import com.podlasenko.example.model.NewsPost;
import com.podlasenko.example.model.Post;
import com.podlasenko.example.model.PostType;
import com.podlasenko.example.model.ProductPost;

public class PostFactory {

    public static Post createPost(PostType type) {
        switch (type) {
            case BLOG:
                return new BlogPost();
            case NEWS:
                return new NewsPost();
            case PRODUCT:
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Type is not supported");
        }
    }
}
