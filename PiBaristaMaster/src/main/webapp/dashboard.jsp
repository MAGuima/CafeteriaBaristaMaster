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
            <th>categoria_produto</th>
            <th>subcategoria_produto</th>
            <th>nome_produto</th>
            <th>descritivo</th>
            <th>preco_custo</th>
            <th>preco_venda</th>
            <th>marca</th>
            <th>modelo</th>
            <th>unidade</th>
            <th>estoque_total</th>
            <th>estoque_minimo</th>
            <th>origem</th>
            <th>NCM</th>
            <th>CEST</th>
           <th></th>
        </tr>

        <c:forEach var="produtos" items="${produtos}">

        <tr>


                        <td>${produtos.categoria_produto}</td>
                        <td>${produtos.subcategoria_produto}</td>
                        <td>${produtos.nome_produto}</td>
                        <td>${produtos.descritivo}</td>
                        <td>${produtos.preco_custo}</td>
                        <td>${produtos.preco_venda}</td>
                        <td>${produtos.marca}</td>
                        <td>${produtos.modelo}</td>
                        <td>${produtos.unidade}</td>
                        <td>${produtos.estoque_total}</td>
                        <td>${produtos.estoque_minimo}</td>
                        <td>${produtos.origem}</td>
                        <td>${produtos.NCM}</td>
                        <td>${produtos.CEST}</td>
        </tr>
        </c:forEach>
    </table>

  </div>
</body>
</html>
