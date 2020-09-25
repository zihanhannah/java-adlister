import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstLastNameServlet", urlPatterns = "/name")
public class FirstLastNameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name =request.getParameter("name");
        if(name != null){
            name = "CodeUp";
        } else {
            name = "Zihan Zhao";
        }
        response.getWriter().println("Hello, " + name);











//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//
//        String name = req.getParameter("name");
//        if(name == null){
//            out.println("Hello, Codeup");
//        }
//        out.println("<h1> Hello, I am Zihan Zhao <h1>");
    }
}
