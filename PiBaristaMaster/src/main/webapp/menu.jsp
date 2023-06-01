<!DOCTYPE html>
<html lang="pt" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
    <link href="css/menu.css" rel="stylesheet"/>
    <link href="css/rodape.css" rel="stylesheet" />
    <link href="css/menuSuperior.css" rel="stylesheet" />
    <meta charset="UTF-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <link rel="shortcut icon" href="./img/img_icon/favicon.png" type="image/x-icon" />
    <title>Menu</title>
</head>

<body>
<nav class="menuSuperior">
        <div><a href="index.html">Home</a></div>
        <div><a href="quemSomos.html">Quem somos</a></div>
        <div><a href="eventos.html">Eventos</a></div>
        <div><a href="menu.jsp">Menu</a></div>
        <div><a href="cursos.html">Cursos</a></div>
        <div><a href="#rodape">Contato</a></div>
    </nav>
<div class="tituloMenu">
    <img src="img/img_icon/icon_coffee1.svg" height="200" width="200"/>
    <h1 id="cafe">CAFÉS</h1>
</div>
<section class="flexMenu">

    <c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.categoriaProduto=='cafe'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>${produto.nomeProduto}</h2>
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>

    </div>
</section>
<div class="tituloMenu">
    <img src="img/img_icon/icon_bolo1.svg" height="200" width="200"/>
    <h1 id="bolo">BOLOS ARTESANAIS</h1>
</div>
<section class="flexMenu">
<c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.categoriaProduto=='boloArtesanais'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>${produto.nomeProduto}</h2>
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>
</section>
<div class="tituloMenu">
    <img src="img/img_icon/icon_cake1.svg" height="200" width="200"/>
    <h1 id="sobremesa">SOBREMESAS</h1>
</div>
<section class="flexMenu">
<c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.categoriaProduto=='sobremesa'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>${produto.nomeProduto}</h2>
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>
</section>
<div class="tituloMenu">
    <img src="img/img_icon/icon_lanche1.svg" height="200" width="200"/>
    <h1 id="lanche">LANCHES</h1>
</div>
<section class="flexMenu">
<c:forEach var="produto" items="${produtos}">

        <c:if test="${produto.categoriaProduto=='lanche'}">
        <div>
                    <img height="400" width="400" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${produto.image}" alt="...">
                    <h2>${produto.nomeProduto}</h2>
                    <h2>R$ ${produto.precoVenda}</h2>
                    <p>${produto.descritivo}</p>
                </div>
                </c:if>

    </c:forEach>
</section>
</body>
<footer>
    <section class="footer-container" >
        <div>
            <img class="logoHorizontal" src="img/Logotipo_horizontal.png" alt="Logo">
        </div>
        <div>
            <div id="rodape" class="address">
                <h3> Tel/Whatsapp: (11) 4172.6558 <h3>
                contato@baristamaster.com.br<br>
                Rua: Amador Bueno nº 757 - Santo Amaro<br>
                São Paulo/SP, CEP: 0452-005
            </div>
            <div class="contact-form">
                <input class="email-input" type="text" placeholder="Digite sua mensagem">
                <button class="submit-btn" type="submit">Enviar</button>
            </div>
        </div>
        <div class="social-links">
            <a class="social-link" href="https://www.instagram.com/baristamasteroficial/">Instagram</a>
            <a class="social-link" href="https://api.whatsapp.com/">WhatsApp</a>
            <a class="social-link" href="http://facebook.com/baristamaster">Facebook</a>
        </div>
    </section>
</footer>
</html>