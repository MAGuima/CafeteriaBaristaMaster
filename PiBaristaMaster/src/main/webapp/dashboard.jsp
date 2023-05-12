<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
  <div>
    <h1>Produtos</h1>
    <table>
        <tr>
            <th>codigo_produto</th>
            <th>nome_produto</th>
            <th>categoria_produto</th>
            <th>preco_venda</th>
            <th>image</th>
            <th>descritivo</th>
           <th>Actions</th>
        </tr>

        <c:forEach var="produtos" items="${produtos}">

        <tr>

                        <td>${produtos.codigo_produto}</td>
                        <td>${produtos.nome_produto}</td>
                        <td>${produtos.categoria_produto}</td>
                        <td>${produtos.preco_venda}</td>
                        <td>${produtos.image}</td>
                        <td>${produtos.descritivo}</td>

                        <td>
                            <form action="/delete-produto" method="post">
                              <input type="hidden" codigo_produto="codigo_produto" name="codigo_produto" value="${produtos.codigo_produto}">
                              <button type="submit">Delete</button>
                              <span> | </span>
                              <a href="cadastroProduto.jsp?id=${produtos.codigo_produto}&name=${produtos.nome_produto}">Update</a>


                            </form>

                            <form action="/create-produto" method="post">
                                <label>Nome produto</label>
                                <input type="text" name="nome_produto" id="nome_produto" value="${param.nome_produto}">
                                <input type="hidden" id="codigo_produto" name="codigo_produto" value="${param.codigo_produto}">
                                <button type="submit">Save</button>

                            </form>
                        </td>
        </tr>
        </c:forEach>
    </table>

  </div>
</body>
</html>
