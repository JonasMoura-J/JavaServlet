package br.com.jonasgerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("cadastrando nova empresa");
		String nomeEmpresa = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		
		out.println(String.format("<html><body>Empresa %s cadastrada</body></html>", nomeEmpresa));
	}

}
