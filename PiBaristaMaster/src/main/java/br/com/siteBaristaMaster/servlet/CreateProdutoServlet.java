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

        String nomeProduto = request.getParameter("nome_produto");
        String categoria_produto = request.getParameter("categoria_produto");
        String subcategoria_produto = request.getParameter("subcategoria_produto");
        String descritivo = request.getParameter("descritivo");
        //String precoCustoString = request.getParameter("preco_custo");
        //double preco_custo = precoCustoString.isEmpty() || precoCustoString == null ? 0.0 : Double.parseDouble(precoCustoString);
        double preco_custo = Double.parseDouble(request.getParameter("preco_custo"));
        //String precoVendaString = request.getParameter("preco_venda");
        //double preco_venda = precoVendaString.isEmpty() || precoVendaString == null ? 0.0 : Double.parseDouble(precoVendaString);
        double preco_venda = Double.parseDouble(request.getParameter("preco_venda"));
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String unidade = request.getParameter("unidade");
        boolean produto_ativo = Boolean.parseBoolean(request.getParameter("produto_ativo"));
        String estoqueTotalParam = request.getParameter("estoque_total");
        int estoque_total = estoqueTotalParam != null ? Integer.parseInt(estoqueTotalParam) : 0;
        String estoqueMinimoParam = request.getParameter("estoque_minimo");
        int estoque_minimo = estoqueMinimoParam != null ? Integer.parseInt(estoqueMinimoParam) : 0;

//        int estoque_total = Integer.parseInt(request.getParameter("estoque_total"));
//        int estoque_minimo = Integer.parseInt(request.getParameter("estoque_minimo"));

        String origem = request.getParameter("origem");
        String NCM = request.getParameter("NCM");
        String CEST = request.getParameter("CEST");
//        Date data_inicial= Date.valueOf(request.getParameter("data_inicial"));
//        Date data_final = Date.valueOf(request.getParameter("data_final"));
//        Time hora = Time.valueOf(request.getParameter("hora"));



        Produtos produtos = new Produtos(nomeProduto,categoria_produto,subcategoria_produto,descritivo,/*precoCustoString,*/preco_custo,preco_venda,marca,modelo,unidade,estoque_total,estoque_minimo,origem,NCM,CEST/*,precoVendaString*/);



        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.createProduto(produtos);
        //System.out.println(nomeProduto);

        //request.getRequestDispatcher("cadastroProduto.html").forward(request, response);
        resp.sendRedirect("/find-all-produtos");
//        super.doPost(request, response);
    }
}
