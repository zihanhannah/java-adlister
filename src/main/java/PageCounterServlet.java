import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet {

        private int hitCount = 0;


        public void doGet(HttpServletRequest req, HttpServletResponse res)
                throws  IOException {

            // Set response content type
            res.setContentType("text/html");
            String counter = req.getParameter("counter");

            boolean resetCount = req.getParameter("reset")!= null;
            if(resetCount){
                hitCount = 0;
            }
//            if (counter != null){
//                hitCount = 0;
//            }
            hitCount++;
            PrintWriter out = res.getWriter();


            out.println("<h1>the total view count is " + hitCount + "<h1>");



        }


}
