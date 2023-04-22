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
        String categoria_produto = request.getParameter("categoria_produto");
        String subcategoria_produto = request.getParameter("subcategoria_produto");
        String descritivo = request.getParameter("descritivo");
        String precoCustoString = request.getParameter("preco_custo");
        double preco_custo = precoCustoString.isEmpty() || precoCustoString == null ? 0.0 : Double.parseDouble(precoCustoString);
        String precoVendaString = request.getParameter("preco_venda");
        double preco_venda = precoVendaString.isEmpty() || precoVendaString == null ? 0.0 : Double.parseDouble(precoVendaString);
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String unidade = request.getParameter("unidade");
        boolean produto_ativo = Boolean.parseBoolean(request.getParameter("produto_ativo"));


//        int estoque_total = Integer.parseInt(request.getParameter("estoque_total"));
//        int estoque_minimo = Integer.parseInt(request.getParameter("estoque_minimo"));
        String origem = request.getParameter("origem");
        String NCM = request.getParameter("NCM");
        String CEST = request.getParameter("CEST");
//        Date data_inicial= Date.valueOf(request.getParameter("data_inicial"));
//        Date data_final = Date.valueOf(request.getParameter("data_final"));
//        Time hora = Time.valueOf(request.getParameter("hora"));



        Produtos produtos = new Produtos();
        //produtos.setNome_produto(nomeProduto);
        produtos.setCategoria_produto(categoria_produto);
        produtos.setSubcategoria_produto(subcategoria_produto);
        produtos.setDescritivo(descritivo);
        produtos.setPrecoCustoString(precoCustoString);
        produtos.setPrecoVendaString(precoVendaString);
        produtos.setMarca(marca);
        produtos.setModelo(modelo);
        produtos.setUnidade(unidade);

        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.createProduto(produtos);
        System.out.println(nomeProduto);

        request.getRequestDispatcher("cadastroProduto.html").forward(request, response);
//        super.doPost(request, response);
    }
}
