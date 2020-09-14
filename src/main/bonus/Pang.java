import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PangServlet", urlPatterns = "/pang")
public class Pang extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.print("<a href='/ping'>Ping</a>");
        }

}
