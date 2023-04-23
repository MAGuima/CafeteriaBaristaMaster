package br.com.siteBaristaMaster.dao;

import br.com.siteBaristaMaster.model.Produtos;

import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ProdutoDao {
    public void createProduto(Produtos produtos) {
        
        String SQL = "INSERT INTO PRODUTOS (nome_produto,categoria_produto,subcategoria_produto,descritivo,preco_custo,preco_venda,marca,modelo,unidade,estoque_total,estoque_minimo,origem,NCM,CEST) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produtos.getNome_produto());
            preparedStatement.setString(2, produtos.getCategoria_produto());
            preparedStatement.setString(3, produtos.getSubcategoria_produto());
            preparedStatement.setString(4, produtos.getDescritivo());
            preparedStatement.setDouble(5, produtos.getPreco_custo());
            preparedStatement.setDouble(6, produtos.getPreco_venda());
            preparedStatement.setString(7, produtos.getMarca());
            preparedStatement.setString(8, produtos.getModelo());
            preparedStatement.setString(9, produtos.getUnidade());
            //preparedStatement.setBoolean(10, produtos.isProduto_ativo());
            preparedStatement.setInt(10, produtos.getEstoque_total());
            preparedStatement.setInt(11, produtos.getEstoque_minimo());
            preparedStatement.setString(12, produtos.getOrigem());
            preparedStatement.setString(13, produtos.getNCM());
            preparedStatement.setString(14, produtos.getCEST());


            preparedStatement.executeUpdate();

            System.out.println("success in insert product");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error in database connection: " + e.getMessage());
        }

    }
    public List<Produtos> findAllProdutos() {

        String SQL = "SELECT * FROM PRODUTOS";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produtos> produtos = new ArrayList<>();

            while (resultSet.next()) {

                String nome_produto = resultSet.getString("nome_produto");
                String categoria_produto = resultSet.getString("categoria_produto");
                String subcategoria_produto = resultSet.getString("subcategoria_produto");
                String descritivo = resultSet.getString("descritivo");
                //String precoCustoString = resultSet.getString("precoCustoString");
                double preco_custo = resultSet.getDouble("preco_custo");
                double preco_venda = resultSet.getDouble("preco_venda");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String unidade = resultSet.getString("unidade");
                int estoque_total = resultSet.getInt("estoque_total");
                int estoque_minimo = resultSet.getInt("estoque_minimo");
                String origem = resultSet.getString("origem");
                String NCM = resultSet.getString("NCM");
                String CEST = resultSet.getString("CEST");
                //String precoVendaString = resultSet.getString("precoVendaString");

                Produtos produto = new Produtos(nome_produto,categoria_produto,subcategoria_produto,descritivo,/*precoCustoString,*/preco_custo,preco_venda,marca,modelo,unidade,estoque_total,estoque_minimo,origem,NCM,CEST/*,precoVendaString*/);

                produtos.add(produto);

            }

            System.out.println("success in select * produtos");

            connection.close();

            return produtos;

        } catch (Exception e) {

            System.out.println("fail in database connection" + e.getMessage());

            return Collections.emptyList();

        }

    }

}
