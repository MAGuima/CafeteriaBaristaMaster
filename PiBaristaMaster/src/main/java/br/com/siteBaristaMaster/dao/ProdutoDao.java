package br.com.siteBaristaMaster.dao;

import br.com.siteBaristaMaster.model.Produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Time;
public class ProdutoDao {
    public void createProduto(Produtos produtos) {
        
        String SQL = "INSERT INTO PRODUTOS (nome_produto,categoria_produto,subcategoria_produto,descritivo,preco_custo,preco_venda,marca,modelo,unidade,produto_ativo,estoque_total,estoque_minimo,origem,NCM,CEST,data_inicial,data_final,hora) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
            preparedStatement.setBoolean(10, produtos.isProduto_ativo());
            preparedStatement.setInt(11, produtos.getEstoque_total());
            preparedStatement.setInt(12, produtos.getEstoque_minimo());
            preparedStatement.setString(13, produtos.getOrigem());
            preparedStatement.setString(14, produtos.getNCM());
            preparedStatement.setString(15, produtos.getCEST());


            preparedStatement.executeUpdate();

            System.out.println("success in insert product");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
        }

    }
}
