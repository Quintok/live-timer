package quintok.resources;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import quintok.model.Comment;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "comments", path="comments")
public interface CommentResource extends PagingAndSortingRepository<Comment, Long> {

    List<Comment> findByAuthor(@Param("author") final String author);

}
