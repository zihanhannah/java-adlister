import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderSummaryServlet", urlPatterns = "/order-summary")
public class OrderSummaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String product = req.getParameter("ProductName");
        String quantity = req.getParameter("Quantity");

        out.println("the product name is " + product);
        out.println("the quantity is " + quantity);
    }
}
