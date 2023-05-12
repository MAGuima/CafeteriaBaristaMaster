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
                                                                                                               //1,2,3,4,5
        String SQL = "INSERT INTO PRODUTOS (nome_produto,categoria_produto,preco_venda,image,descritivo) VALUES (?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produtos.getNome_produto());//1
            preparedStatement.setString(2, produtos.getCategoria_produto());//2
            preparedStatement.setDouble(3, produtos.getPreco_venda());//3
            preparedStatement.setString(4, produtos.getImage()); //4
            preparedStatement.setString(5, produtos.getDescritivo());//5



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
                String codigo_produto = resultSet.getString("codigo_produto"); //0
                String nome_produto = resultSet.getString("nome_produto"); //1
                String categoria_produto = resultSet.getString("categoria_produto"); //2
                double preco_venda = resultSet.getDouble("preco_venda");// 3
                String image = resultSet.getString("image");//4
                String descritivo = resultSet.getString("descritivo");//5
                //public Produtos(String        codigo_produto,nome_produto,categoria_produto,descritivo,preco_venda,image)
                Produtos produto = new Produtos(codigo_produto,nome_produto,categoria_produto,preco_venda,image,descritivo);

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

    public void updateProduto(Produtos produtos){

        String SQL = "UPDATE PRODUTOS SET NOME_PRODUTO = ? WHERE CODIGO_PRODUTO = ?";
        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucess in database conenction");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produtos.getNome_produto());
            preparedStatement.setString(2,produtos.getCodigo_produto());

//            preparedStatement.setString(3, produtos.getCategoria_produto());
//            preparedStatement.setString(4, produtos.getSubcategoria_produto());
//            preparedStatement.setString(5, produtos.getDescritivo());
//            preparedStatement.setDouble(6, produtos.getPreco_custo());
//            preparedStatement.setDouble(7, produtos.getPreco_venda());
//            preparedStatement.setString(8, produtos.getMarca());
//            preparedStatement.setString(9, produtos.getModelo());
//            preparedStatement.setString(10, produtos.getUnidade());
//            preparedStatement.setInt(11, produtos.getEstoque_total());
//            preparedStatement.setInt(12, produtos.getEstoque_minimo());
//            preparedStatement.setString(13, produtos.getOrigem());
//            preparedStatement.setString(14, produtos.getNCM());
//            preparedStatement.setString(15, produtos.getCEST());
            preparedStatement.execute();

            System.out.println("Sucess in update produto");

            connection.close();


        }catch (Exception e){
            System.out.println("Fail in database connection");
            System.out.println("Error + " + e.getMessage());
        }


    }

}
