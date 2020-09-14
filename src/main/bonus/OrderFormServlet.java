import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "OrderFormServlet", urlPatterns = "/order-form")
public class OrderFormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setHeader("Content-Type", "text/html");

        PrintWriter out = res.getWriter();

        out.println("<html><head><title> Order Form </title></head>");
        out.println("<body><h1> Order Form </h1>");
        out.println("<form action=\"/order-summary\" method = \"post\">");
        out.println("<label for = \"ProductName\">Product Name : </label>");
        out.println("<input type = \"text\" id = \"ProductName\" name = \"ProductName\">");
        out.println("<label for = \"Quantity\">Quantity : </label>");
        out.println("<input type = \"text\" id = \"Quantity\" name = \"Quantity\">");
        out.println("<input type=\"submit\" value=\"Submit\">" );

    }
}
