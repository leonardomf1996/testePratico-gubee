<%-- 
    Document   : principal
    Created on : 05/12/2019, 19:04:22
    Author     : Leonardo
--%>

<%@page import="java.util.List"%>
<%@page import="model.Produto"%>
<%@page import="DAO.ProdutoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ProdutoDao dao = new ProdutoDao();

    List<Produto> lista;

    lista = dao.listar();
%>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Gubee</title>
        <link rel="stylesheet" type="text/css" href="./css/estilo.css">
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.7.2.min.js"></script> 
        <script type="text/javascript" src="js/js.js"></script>
    </head>
    <body>

        <table>
            <caption>Gubee</caption>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Produto</th>
                    <th>Descrição</th>
                    <th>Público alvo</th>
                    <th>Tecnologias</th>
                </tr>
                <tr>
                    <th><input type="text" id="txtColuna1"/></th>
                    <th><input type="text" id="txtColuna2"/></th>
                    <th><input type="text" id="txtColuna3"/></th>
                    <th><input type="text" id="txtColuna4"/></th>
                    <th><input type="text" id="txtColuna5"/></th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (Produto registro : lista) {
                %>
                <tr>
                    <td><%=registro.getId()%></td>
                    <td><%=registro.getProductName()%></td>
                    <td><%=registro.getDescription()%></td>
                    <td><%=registro.getTargetMarket()%></td>
                    <td><%=registro.getStack()%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

        <input type='button' value='Limpar filtros' onclick='history.go(0)' class="limparFiltros" />

    </body>
</html>