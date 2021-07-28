package Product_Java;

import Product.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/editshow"})
public class ServletProduct_ShowEdit extends HttpServlet {
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
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        ServletProduct_Add.list.get(ServletProduct_Edit.numList).setId(id);
        ServletProduct_Add.list.get(ServletProduct_Edit.numList).setName(name);
        ServletProduct_Add.list.get(ServletProduct_Edit.numList).setPrice(price);

        req.setAttribute("listSP", ServletProduct_Add.list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("ShowProduct.jsp");
        dispatcher.forward(req, resp);
    }
}
