package com.podlasenko.example.factory;

import com.podlasenko.example.model.BlogPost;
import com.podlasenko.example.model.NewsPost;
import com.podlasenko.example.model.Post;
import com.podlasenko.example.model.ProductPost;
import org.junit.Test;

import static com.podlasenko.example.model.PostType.BLOG;
import static com.podlasenko.example.model.PostType.NEWS;
import static com.podlasenko.example.model.PostType.PRODUCT;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostFactoryTest {

    @Test
    public void createPost_ShouldReturnCorrectPostType() {
        Post blogPost = PostFactory.createPost(BLOG);
        assertThat(blogPost, instanceOf(BlogPost.class));

        Post newsPost = PostFactory.createPost(NEWS);
        assertThat(newsPost, instanceOf(NewsPost.class));

        Post productPost = PostFactory.createPost(PRODUCT);
        assertThat(productPost, instanceOf(ProductPost.class));
    }
}
