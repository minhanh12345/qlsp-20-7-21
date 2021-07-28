package Product_Java;

import Product.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/edit"})
public class ServletProduct_Edit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // thêm cặp key - value vào request để gửi.
        req.setAttribute("listSP", ServletProduct_Add.list);

        // RequestDispatcher điều hướng request và response sang 1 servlet or jsp khác.
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("ShowProduct.jsp");

        // chuyển tếp request và reponse đi cho thằng servlet khác sử lý.
        dispatcher.forward(req, resp);
    }
static int numList;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        numList=Integer.parseInt(req.getParameter("edit"));


        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("EditProduct.jsp");
        dispatcher.forward(req, resp);
    }
}
