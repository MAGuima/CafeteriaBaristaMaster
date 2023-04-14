package br.com.siteBaristaMaster.servlet;

import br.com.siteBaristaMaster.dao.ProdutoDao;
import br.com.siteBaristaMaster.model.Produtos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-produto")
public class CreateProdutoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeProduto = request.getParameter("nome_produto");
        Produtos produtos = new Produtos();
        produtos.setNome_produto(nomeProduto);

        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.createProduto(produtos);
        System.out.println(nomeProduto);

        request.getRequestDispatcher("cadastroProduto.html").forward(request, response);
//        super.doPost(request, response);
    }
}
