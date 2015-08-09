package quintok.resources;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import quintok.model.Task;

@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskResource extends PagingAndSortingRepository<Task, Long> {
}