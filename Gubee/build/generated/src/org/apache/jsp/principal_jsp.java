package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Produto;
import DAO.ProdutoDao;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    ProdutoDao dao = new ProdutoDao();

    List<Produto> lista;

    lista = dao.listar();

      out.write("\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <title>Gubee</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <caption>Gubee</caption>\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Produto</th>\n");
      out.write("                        <th>Descrição</th>\n");
      out.write("                        <th>Público alvo</th>\n");
      out.write("                        <th>Tecnologias</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><input type=\"text\" id=\"txtColuna1\"/></th>\n");
      out.write("                        <th><input type=\"text\" id=\"txtColuna2\"/></th>\n");
      out.write("                        <th><input type=\"text\" id=\"txtColuna3\"/></th>\n");
      out.write("                        <th><input type=\"text\" id=\"txtColuna4\"/></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (Produto registro : lista) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(registro.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(registro.getProductName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(registro.getDescription());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(registro.getTargetMarket());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(registro.getStack());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <select name=\"targetMarket\" multiple size=\"4\" class=\"targetMarket\">\n");
      out.write("                <option value=\"ecommerce\">Ecommerce</option>\n");
      out.write("                <option value=\"erp\">ERP</option>\n");
      out.write("                <option value=\"lojista\">Lojista que não desejam possuir ecommerce</option>\n");
      out.write("                <option value=\"lojaFisica\">Loja física</option>\n");
      out.write("                <option value=\"telecom\">Telecom</option>\n");
      out.write("                <option value=\"venda\">Venda direta</option>\n");
      out.write("                <option value=\"mobile\">Mobile First</option>\n");
      out.write("                <option value=\"digital\">Digital Onboarding</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <select name=\"stack\" multiple size=\"5\" class=\"stack\">\n");
      out.write("                <option value=\"java\">Java 10</option>\n");
      out.write("                <option value=\"kotlin\">Kotlin</option>\n");
      out.write("                <option value=\"kafka\">Kafka</option>\n");
      out.write("                <option value=\"event\">Event Stream</option>\n");
      out.write("                <option value=\"redis\">Redis</option>\n");
      out.write("                <option value=\"mongodb\">MongoDB</option>\n");
      out.write("                <option value=\"nodejs\">NodeJS</option>\n");
      out.write("                <option value=\"bigData\">Big Data Analytics</option>\n");
      out.write("                <option value=\"hadoop\">Hadoop</option>\n");
      out.write("                <option value=\"pig\">Pig</option>\n");
      out.write("                <option value=\"cassandra\">Cassandra</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <button formaction=\"\">Filtrar</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
