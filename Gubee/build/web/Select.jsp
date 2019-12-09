<%-- 
    Document   : Select
    Created on : 06/12/2019, 18:08:53
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

    lista = dao.select();
%>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Gubee</title>
        <link rel="stylesheet" type="text/css" href="./css/estilo.css">
    </head>
    <body>

        <form method="GET">

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


            <select name="targetMarket" multiple size="4" class="targetMarket">
                <option name="ecommerce" value="ecommerce">Ecommerce</option>
                <option name="erp" value="erp">ERP</option>
                <option name="lojista" value="lojista">Lojista que não desejam possuir ecommerce</option>
                <option name="lojaFisica" value="lojaFisica">Loja física</option>
                <option name="telecom" value="telecom">Telecom</option>
                <option name="venda" value="venda">Venda direta</option>
                <option name="mobile" value="mobile">Mobile First</option>
                <option name="digital" value="digital">Digital Onboarding</option>
            </select>

            <select name="stack" multiple size="5" class="stack">
                <option name="java" value="java">Java 10</option>
                <option name="kotlin" value="kotlin">Kotlin</option>
                <option name="kafka" value="kafka">Kafka</option>
                <option name="event" value="event">Event Stream</option>
                <option name="redis" value="redis">Redis</option>
                <option name="mongodb" value="mongodb">MongoDB</option>
                <option name="nodejs" value="nodejs">NodeJS</option>
                <option name="bigData" value="bigData">Big Data Analytics</option>
                <option name="hadoop" value="hadoop">Hadoop</option>
                <option name="pig" value="pig">Pig</option>
                <option name="cassandra" value="cassandra">Cassandra</option>
            </select>

                <button type="submit" formaction="select">Filtrar</button>

        </form>
    </body>
</html>