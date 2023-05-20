<!DOCTYPE html>
<html lang="pt" xmlns="http://www.w3.org/1999/html">

<head>
    <link href="css/cadastroProduto.css" rel="stylesheet"/>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <link rel="shortcut icon" href="./img/img_icon/favicon.png" type="image/x-icon">
    <title>Cadastro de Produtos</title>
</head>

<body>

<div class="containerHead">
    <h1>Cadastro de Produtos</h1>
</div>

<form action="/create-produto" method="post" enctype="multipart/form-data">
    <div class="tela">
        <div class="containerCadastro"> <!-- contém os campos de cadastro dos dados do usuario -->

            <li>
                            <div>
                                <label>Codigo:</label> <!-- nome do campo -->
                                <div>
                                    <input type="text" name="codigo_produto" id="codigo_produto" value="${param.id}"> <!-- "input" para que o usuario possa escrever o valor do campo -->
                                </div>
                            </div>
                        </li>

            <li>
                            <div>
                                <label>Nome do Produto:</label>
                                <div>
                                    <input type="text" name="nome_produto" id="nome_produto">
                                </div>
                            </div>
                        </li>

            <li>
                <div>
                    <label>Categoria:</label>
                    <div>

                        <select name="categoria_produto" id="categoria_produto">
                        <option value="cafe">Cafes </option>
                        <option value="boloArtesanais">Bolos Artesanais </option>
                        <option value="sobremesa">Sobremesa </option>
                        <option value="lanche">Lanche </option>
                        </select>

                    </div>
                </div>
            </li>

            <li>
                            <div>
                                <label>Preço de venda:</label>
                                <div>
                                    <input type="text" name="preco_venda" id="preco_venda">
                                </div>
                            </div>
                        </li>
             <li>
                             <div>
                                 <label>image:</label>
                                 <div>

                                 </div>
                                 <div>
                                         <label for="file">Choose file</label>
                                         <input type="file" name="file" id="file">
                                     </div>
                             </div>
                         </li>

            <li>
                <div>
                    <label>Descritivo:</label>
                    <div>
                        <input type="text" name="descritivo" id="descritivo">
                    </div>
                </div>
            </li>

        </div>
        <div class="containerBotoes"> <!-- FALTA configurar corretamente o codigo dos botoes -->
            <button class="btIncluir" type="submit">Incluir</button>
            <button class="btCancelar" type="submit">Cancelar</button>
            <button class="btImagem" type="submit">Imagem</button>
            <button class="btVoltar" type="submit">Voltar</button>
        </div>
    </div>
</form>
</body>
</html>