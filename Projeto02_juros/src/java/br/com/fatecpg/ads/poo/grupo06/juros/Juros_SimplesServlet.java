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
            + "<link href='css/bootstrap.min.css' rel='stylesheet'>"
            + "<link rel='stylesheet' href='css/font-awesome.min.css'>"
            + "<link rel='stylesheet' href='css/animate.css'>"
            + "<link rel='stylesheet' href='css/overwrite.css'>"
            + "<link href='css/animate.min.css' rel='stylesheet'> "
            + "<link href='css/style.css' rel='stylesheet' />"
            +"</head>"
            +"<body>"
            //Cálculo do Juros ao Mês
            +"<header id='header'>"
            +"<nav class='navbar navbar-fixed-top' role='banner'>"
            +"<div class='container'>"
            +"<div class='navbar-header'>"
            +"<button type='button' class='navbar-toggle' data-toggle='collapse' data-target='.navbar-collapse'>"
            +"<span class='sr-only'>Toggle navigation</span>"
            +"<span class='icon-bar'></span>"
            +"<span class='icon-bar'></span>"
            +"<span class='icon-bar'></span>"
            +"</button>"
            +"<a class='navbar-brand' href='home'>Calcular Juros</a>"
            +"</div>				"
            + "<div class='collapse navbar-collapse navbar-right'>"
            + "<ul class='nav navbar-nav'>"
            +"<li class=\'active\'><a href='home'>HOME</a></li>"
            + "<li><a href='juros-simples'>SIMPLES</a></li>"
            + "<li><a href='juros-composto'>COMPOSTO</a></li>"
            + "<li><a href='home#team'>EQUIPE</a></li>"
            + "</ul>"
            + "</div>"
            +"</div><!--/.container-->"
            +"</nav><!--/nav-->		"
            +"</header><!--/header-->	"
            +"<div class='slider'>		"
            +"<div id='about-slider'>"
            +"<div id='carousel-slider' class='carousel slide' data-ride='carousel'>"
            +"<!-- Indicators -->"
            +"<ol class='carousel-indicators visible-xs'>"
            +"<li data-target='#carousel-slider' data-slide-to='0' class='active'></li>"
            +"<li data-target='#carousel-slider' data-slide-to='1'></li>"
            +"<li data-target='#carousel-slider' data-slide-to='2'></li>"
            +"</ol>"
	    +"<div class='item'>"
            +"<img src='img/1.jpg' class='img-responsive' alt=''> "
            +"<div class='carousel-caption'>"
            +"<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='0.5s'>"								
	    +"<h2>Calcule Juros Simples</h2>"
	    +"</div>"
            +"</div>"
            +"</div>"
	    +"</div>"
            +"</div>"
            +"<a class='left carousel-control hidden-xs' href='#carousel-slider' data-slide='prev'>"
            +"<i class='fa fa-angle-left'></i> "
            +"</a>"	
            +"<a class='right carousel-control hidden-xs'href='#carousel-slider' data-slide='next'>"
            +"<i class='fa fa-angle-right'></i> "
            +"</a>"
            +"</div> <!--/#carousel-slider-->"
            +"</br>"
            +"<div class='flex-container'>"
            +"<center><table style='text-align:right; font-size:20px'>"
            +"<td><br></td>"
            +"<tr><td>Valor Inicial: </td><td> <input type='text' name='valorIni'/></td></tr>"
            +"<td><br></td>"
            +"<tr><td>Juros ao Mês (%) </td><td> <input type='text' name='percent'/></td></tr>"
            +"<td><br></td>"
            +"<tr><td>Período em meses: </td><td> <input type='text' name='numMes'/></td></tr>"
            +"<td><br></td>"
            +"<tr><td colspan='2'><center><input type='submit' value='Calcular'/><center></td></tr>"
            +"<td><br></td>"
            +"");
            try{
                valorIni = Double.parseDouble(request.getParameter("valorIni"));
                percent = Double.parseDouble(request.getParameter("percent"));
                numMes = Double.parseDouble(request.getParameter("numMes"));
            }catch(Exception ex){}
            String numero ;
            valorTotal1 = valorIni+(valorIni*(percent/100)*numMes);
            valorJuros1 = (valorIni*(percent/100)*numMes); 
            out.println("<tr><td>Valor total do Montante: R$"+valorTotal1+"</td></tr>"
            +"<td><br></td>"
            +"<tr><td>Valor do Juros ao Mês: R$"+valorJuros1+"</td></tr>"
            +"<td><br></td>"
            //Calculo do Juros ao Ano
            
            +"<h1>Cálculo de Juros ao Ano</h1>"
            +"<center><form><table style='text-align:right; font-size:20px'>"
            +"<td><br></td>"
            +"<tr><td>Valor Inicial: </td><td> <input type='text' name='valorIni2'/></td></tr>"
            +"<td><br></td>"
            +"<tr><td>Juros ao Ano (%) </td><td> <input type='text' name='percent2'/></td></tr>"
            +"<td><br></td>"
            +"<tr><td>Período em dias: </td><td> <input type='text' name='numDia'/></td></tr>"
            +"<td><br></td>"
            +"<tr><td colspan='2'><center><input type='submit' value='Calcular'/><center></td></tr>"
            +"<td><br></td>");        
            try{
                valorIni2 = Double.parseDouble(request.getParameter("percent2"));
                percent2 = Double.parseDouble(request.getParameter("percent2"));
                numDia = Double.parseDouble(request.getParameter("numDia"));
            }catch(Exception ex){}
            valorTotal2 = valorIni2+(valorIni2*((percent2/100)*(numDia/365)));
            valorJuros2 = valorIni2*((percent2/100)*(numDia/365));
           out.println("<tr><td>Valor total do Montante: R$"+valorTotal2+"</td></tr>"
            +"<td><br></td>"
            +"<tr><td>Valor do Juros ao Ano: R$"+valorJuros2+"</td></tr>"
            +"<td><br></td>"
            +"</br>"
            +"<div class='flex-container'>"
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
