package ru.volkovd.blog.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.volkovd.blog.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
