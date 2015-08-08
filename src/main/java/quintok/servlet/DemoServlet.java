package quintok.servlet;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quintok.model.Comment;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DemoServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(DemoServlet.class);

    private final ObjectMapper mapper;

    public DemoServlet() {
        mapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.warn("Request made from {}", req.getRemoteAddr());

        List<Comment> comments = new ArrayList<>();

        comments.add(new Comment("Author", "Comment"));

        resp.setContentType("application/json");

        mapper.writeValue(resp.getWriter(), comments);
    }
}
