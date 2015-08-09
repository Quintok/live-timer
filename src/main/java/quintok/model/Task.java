package quintok.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {



    public enum Priority {
        NONE, // None
        ONE, // "!"
        TWO, // "!!"
        THREE // "!!!"
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long timeExecuted;

    private String title;
    private String description = "";
    private Priority priority = Priority.NONE;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
