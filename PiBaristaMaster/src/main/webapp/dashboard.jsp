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

                        <td>${produtos.codigoProduto}</td>
                        <td>${produtos.nomeProduto}</td>
                        <td>${produtos.categoriaProduto}</td>
                        <td>${produtos.precoVenda}</td>
                        <td>${produtos.image}</td>
                        <td>${produtos.descritivo}</td>
                        <td>
                            <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produtos.image}">
                              <img style="width: 100px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produtos.image}" alt="...">
                            </a>
                        </td>
                        <td>
                            <form action="/delete-produto" method="post">
                              <input type="hidden" codigo_produto="codigoProduto" name="codigoProduto" value="${produtos.codigoProduto}">
                              <button type="submit">Delete</button>
                              <span> | </span>
                              <a href="cadastroProduto.jsp?id=${produtos.codigoProduto}&name=${produtos.nomeProduto}">Update</a>

                            </form>


                        </td>
        </tr>
        </c:forEach>
    </table>

  </div>
</body>
</html>
