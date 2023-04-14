package br.com.siteBaristaMaster.dao;

import br.com.siteBaristaMaster.model.Produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProdutoDao {
    public void createProduto(Produtos produtos) {
        String SQL = "INSERT INTO PRODUTOS (NOME_PRODUTO) VALUES (?)";
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produtos.getNome_produto());
            preparedStatement.execute();

            System.out.println("success in insert product");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
        }

    }
}
