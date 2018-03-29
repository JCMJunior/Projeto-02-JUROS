/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.grupo06.juros;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mitsu
 */
@WebServlet(name = "Juros_SimplesServlet", urlPatterns = {"/juros-simples"})
public class Juros_SimplesServlet extends HttpServlet {
    double valorIni,valorIni2,percent,percent2,numDia,numMes,
            valorTotal1,valorJuros1,valorTotal2,valorJuros2;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>"
            +"<html>"
            +"<head>"
            +"<title>Servlet Juros_SimplesServlet</title>"
            +"</head>"
            +"<body>"
            //Cálculo do Juros ao Mês
            +"<h1>Cálculo de Juros Simples ao Mês</h1>"
            +"<form>"
            +"Valor Inicial: <input type='text'name='valorIni'/>"
            +"Juros ao Mês: <input type='text' name='percent'/>"
            +"Quantidade de Meses: <input type='text' name='numMes'/>"
            +"<input type='submit' value='Calcular'/>"
            +"</form>");
            try{
                valorIni = Double.parseDouble(request.getParameter("valorIni"));
                percent = Double.parseDouble(request.getParameter("percent"));
                numMes = Double.parseDouble(request.getParameter("numMes"));
            }catch(Exception e){}
            valorTotal1 = valorIni+(valorIni*(percent/100)*numMes);
            valorJuros1 = valorIni*(percent/100)*numMes;
            out.println("<h2>Valor total do Montante: "+valorTotal1+"<h2>"
            +"<h2>Valor do Juros ao Mês: "+valorJuros1+"<h2>"
            //Calculo do Juros ao Ano
            +"<h1>Cálculo de Juros ao Ano</h1>"
            +"<form>"
            +"Valor Inicial: <input type='text'name='valorIni2'/>"
            +"Juros ao Ano: <input type='text' name='percent2'/>"
            +"Quantidade de Dias: <input type='text' name='numDia'/>"
            +"<input type='submit' value='Calcular'/>"
            +"</form>");
            try{
                valorIni2 = Double.parseDouble(request.getParameter("percent2"));
                percent2 = Double.parseDouble(request.getParameter("percent2"));
                numDia = Double.parseDouble(request.getParameter("numDia"));
            }catch(Exception e){}
            valorTotal2 = valorIni2+(valorIni2*((percent2/100)*(numDia/365)));
            valorJuros2 = valorIni2*((percent2/100)*(numDia/365));
            out.println("<h2>Valor total do Montante: "+valorTotal2+"<h2>"
            +"<h2>Valor do Juros ao Ano: "+valorJuros2+"<h2>"
            +""
            +"</body>"
            +"</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
