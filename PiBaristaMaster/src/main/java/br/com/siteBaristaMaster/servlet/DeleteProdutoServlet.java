package br.com.siteBaristaMaster.servlet;

import br.com.siteBaristaMaster.dao.ProdutoDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-produto")
public class DeleteProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String codigoProduto = req.getParameter("codigoProduto");
        new ProdutoDao().deleteProdutoById(codigoProduto);
        resp.sendRedirect("/find-all-produtos");
    }
}
