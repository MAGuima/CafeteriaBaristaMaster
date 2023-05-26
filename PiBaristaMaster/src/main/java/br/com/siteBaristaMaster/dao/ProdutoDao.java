package br.com.siteBaristaMaster.dao;

import br.com.siteBaristaMaster.model.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ProdutoDao {
    public void createProduto(Produto produto) {
                                                                                                               //1,2,3,4,5
        String SQL = "INSERT INTO PRODUTOS (nome_produto,categoria_produto,preco_venda,image,descritivo) VALUES (?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNomeProduto());//1
            preparedStatement.setString(5, produto.getCategoriaProduto());//2
            preparedStatement.setDouble(3, produto.getPrecoVenda());//3
            preparedStatement.setString(4, produto.getImage()); //4
            preparedStatement.setString(2, produto.getDescritivo());//5



            preparedStatement.executeUpdate();

            System.out.println("success in insert product");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error in database connection: " + e.getMessage());
        }

    }
    public List<Produto> findAllProdutos() {

        String SQL = "SELECT * FROM PRODUTOS";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {
                String codigo_produto = resultSet.getString("codigo_produto"); //0
                String nome_produto = resultSet.getString("nome_produto"); //1
                String categoria_produto = resultSet.getString("categoria_produto"); //2
                double preco_venda = resultSet.getDouble("preco_venda");// 3
                String image = resultSet.getString("image");//4
                String descritivo = resultSet.getString("descritivo");//5
                //public Produtos(String        codigo_produto,nome_produto,categoria_produto,descritivo,preco_venda,image)
                Produto produto = new Produto(codigo_produto,nome_produto,categoria_produto,preco_venda,image,descritivo);

                produtos.add(produto);

            }

            System.out.println("success in select * produtoss");

            connection.close();

            return produtos;

        } catch (Exception e) {

            System.out.println("fail in database connection" + e.getMessage());

            return Collections.emptyList();

        }

    }

    public void deleteProdutoById(String codigo_produto){
            String SQL = "DELETE PRODUTOS WHERE CODIGO_PRODUTO = ?";

            try{

                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

                System.out.println("success in database connection");

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                preparedStatement.setString(1, codigo_produto);
                preparedStatement.executeUpdate();

                System.out.println("success in insert product");

                connection.close();


            } catch (Exception e){
                System.out.println("Fail in database connection " + e.getMessage());
            }

    }

    public void updateProduto(Produto produto){

        String SQL = "UPDATE PRODUTOS SET NOME_PRODUTO = ?, CATEGORIA_PRODUTO = ?, PRECO_VENDA = ?, IMAGE = ?, Descritivo = ? WHERE CODIGO_PRODUTO = ?";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucess in database conenction");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNomeProduto());//1
            preparedStatement.setString(2, produto.getCategoriaProduto());//2
            preparedStatement.setDouble(3, produto.getPrecoVenda());//3
            preparedStatement.setString(4, produto.getImage()); //4
            preparedStatement.setString(5, produto.getDescritivo());//5
            preparedStatement.setString(6, produto.getCodigoProduto());//0

//
//            preparedStatement.setString(5, produtos.getDescritivo());//5
            preparedStatement.execute();

            System.out.println("Sucess in update produto");

            connection.close();


        }catch (Exception e){
            System.out.println("Fail in database connection uppdate produto");
            System.out.println("Error + " + e.getMessage());
        }


    }

}
