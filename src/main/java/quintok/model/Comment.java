package quintok.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String comment;

    public String getAuthor() {
        return author;
    }

    public String getComment() {
        return comment;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}