<!DOCTYPE html>
<html lang="pt" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <link href="css/menu.css" rel="stylesheet"/>
    <link href="css/menuSuperior.css" rel="stylesheet"/>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="img/img_icon/favicon.png" type="image/x-icon">
    <title>Menu</title>
</head>

<body>
<nav class="menuSuperior">
    <div><a href="https://baristamaster.com.br/">Home</a></div>
    <div><a href="https://baristamaster.com.br/quemsomos">Quem somos</a></div>
    <div><a href="https://baristamaster.com.br/eventos">Eventos</a></div>
    <div><a href="https://baristamaster.com.br/menu">Menu</a></div>
    <div><a href="https://baristamaster.com.br/cursos">Cursos</a></div>
    <div><a href="https://baristamaster.com.br/contato">Contato</a></div>
</nav>
<div class="tituloMenu">
    <img src="img/img_icon/icon_coffee1.svg" height="200" width="200"/>
    <h1>CAFÉS</h1>
</div>
<section class="flexMenu">

    <c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.descritivo=='cafe'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>

    </div>
</section>
<div class="tituloMenu">
    <img src="img/img_icon/icon_bolo1.svg" height="200" width="200"/>
    <h1>BOLOS ARTESANAIS</h1>
</div>
<section class="flexMenu">
<c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.descritivo=='boloArtesanais'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>
</section>
<div class="tituloMenu">
    <img src="img/img_icon/icon_cake1.svg" height="200" width="200"/>
    <h1>SOBREMESAS</h1>
</div>
<section class="flexMenu">
<c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.descritivo=='sobremesa'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>
</section>
<div class="tituloMenu">
    <img src="img/img_icon/icon_lanche1.svg" height="200" width="200"/>
    <h1>LANCHES</h1>
</div>
<section class="flexMenu">
<c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.descritivo=='lanche'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>
</section>
</body>
</html>