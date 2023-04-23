package br.com.siteBaristaMaster.servlet;
import br.com.siteBaristaMaster.dao.ProdutoDao;
import br.com.siteBaristaMaster.model.Produtos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-produtos")
public class ListProdutoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Produtos> produtos = new ProdutoDao().findAllProdutos();

        req.setAttribute("produtos",produtos);

        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
    }

}
