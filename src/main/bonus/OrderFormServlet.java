import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "OrderFormServlet", urlPatterns = "/order-form")
//2. Create a servlet that returns a simple form if the user navigates to ```/order-form```. In servering up HTML, you may need to include ```response.setHeader("content-type", "text/html");```. The form should include an input for the name of a product and an input for how many of the product they want to order. The method of the form should be ```POST``` and the action should be ```/order-summary```.
//3. Create a servlet that listens for POST requests to ```/order-summary``` and souts out the name of the product ordered by the user and the quantity.
public class OrderFormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        res.setContentType("text/html");
//        res.setHeader("Content-Type", "text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Order Form</title></head>");
        out.println("<body><form method=\"POST\" action=\"/order-summary\">");
        out.println("<label for=\"ProductName\">Product Name</label>");
        out.println("<input id=\"ProductName\" name=\"ProductName\" type=\"text\">");
        out.println("<br>");
        out.println("<label for=\"Quantity\">Quantity</label>");
        out.println("<input id=\"Quantity\" name=\"Quantity\" type=\"text\">");
        out.println("<br>");
        out.println("<input type=\"submit\">");
        out.println("</form></html>");

    }
}
