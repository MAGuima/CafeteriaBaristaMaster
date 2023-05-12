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
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String codigo_produto = request.getParameter("codigo_produto"); //0
        String nomeProduto = request.getParameter("nome_produto"); //1
        String descritivo = request.getParameter("descritivo"); //2 descritivo
        double preco_venda = Double.parseDouble(request.getParameter("preco_venda"));//3
        String image = request.getParameter("image");// 4 - image
        String categoria_produto = request.getParameter("categoria_produto");//5
        Produtos produtos = new Produtos(codigo_produto,nomeProduto,descritivo,preco_venda,image,categoria_produto);

        ProdutoDao produtoDao = new ProdutoDao();

        if(codigo_produto.isBlank()){
            produtoDao.createProduto(produtos);
        } else {
            produtoDao.updateProduto(produtos);
        }

        resp.sendRedirect("/find-all-produtos");

    }
}
