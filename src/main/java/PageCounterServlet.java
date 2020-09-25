import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet{
    int count = 0;
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException {

        boolean resetCount = request.getParameter("resetCount")!=null;
        if(resetCount){
            count = 0;
        }
        count++;
        response.getWriter().println("<h1>page was viewed by " + count + " times</h1>");

    }
}
