package Product_Java;

import Product.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet(urlPatterns = {"/remove"})
public class ServletProduct_Remove extends HttpServlet {

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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int numList=Integer.parseInt(req.getParameter("remove"));
        ServletProduct_Add.list.remove(numList);
        req.setAttribute("listSP", ServletProduct_Add.list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("ShowProduct.jsp");
        dispatcher.forward(req, resp);
    }
}
