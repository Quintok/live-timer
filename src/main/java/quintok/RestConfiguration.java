package quintok;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import quintok.model.TaskValidator;

@Configuration
public class RestConfiguration extends RepositoryRestMvcConfiguration {
    @Override
    protected void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener v) {
        v.addValidator("beforeCreate", new TaskValidator());
    }
}
