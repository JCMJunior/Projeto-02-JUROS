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
 * @author THE THREE MUSKETEERS
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
    
            out.println("<!DOCTYPE html>"
                    + "<html lang='pt-br'>"
                    
                    + "<head>"
                    + "<meta charset='utf-8'>"
                    + "<meta http-equiv='X-UA-Compatible' content='IE=edge'>"
                    + "<meta name='viewport' content='width=device-width, initial-scale=1'>"
                    + "<title>Calculadora de Juros</title>"
                    + "<link href='css/bootstrap.min.css' rel='stylesheet'>"
                    + "<link rel='stylesheet' href='css/font-awesome.min.css'>"
                    + "<link rel='stylesheet' href='css/animate.css'>"
                    + "<link rel='stylesheet' href='css/overwrite.css'>"
                    + "<link href='css/animate.min.css' rel='stylesheet'> "
                    + "<link href='css/style.css' rel='stylesheet' />"
                    + "</head>"
                    
                    + "<body>"
                    + "<header id='header'>"
                    + "<nav class='navbar navbar-fixed-top' role='banner'>"
                    + "<div class='container'>"
                    + "<div class='navbar-header'>"
                    + "<button type='button' class='navbar-toggle' data-toggle='collapse' data-target='.navbar-collapse'>"
                    + "<span class='sr-only'>Toggle navigation</span>"
                    + "<span class='icon-bar'></span>"
                    + "<span class='icon-bar'></span>"
                    + "<span class='icon-bar'></span>"
                    + "</button>"
                    +"<div class='collapse navbar-collapse navbar-left'>"
                    +"<ul class='nav navbar-nav'>"
                    +"<li class='active'><a >CALCULADORA JUROS </a></li>"                    
                    +"</ul>"
                    +"</div>"
                    + "</div>"
                    + "<div class='collapse navbar-collapse navbar-right'>"
                    + "<ul class='nav navbar-nav'>"
                    +"<li class=\'active\'><a href='home'>HOME</a></li>"
                    + "<li><a href='juros-simples'>SIMPLES</a></li>"
                    + "<li><a href='juros-composto'>COMPOSTO</a></li>"
                    + "<li><a href=\'#team'>EQUIPE</a></li>"
                    + "</ul>"
                    + "</div>"
                    + "</div><!--/.container-->"
                    
                    + "</nav><!--/nav-->"
                    + "</header><!--/header-->"
                    + "<div class='slider'>"
                    + "<div id='about-slider'>"
                    + "<div id='carousel-slider' class='carousel slide' data-ride='carousel'>"
                    + "<!-- Indicators -->"
                    + "<ol class='carousel-indicators visible-xs'>"
                    + "<li data-target='#carousel-slider' data-slide-to='0' class='active'></li>"
                    + "<li data-target='#carousel-slider' data-slide-to='1'></li>"
                    + "</ol>"
                    + "<div class='carousel-inner'>"
                    + "<div class='item active'>"
                    + "<img src='img/7.jpg' class='img-responsive' alt=''>"
                    + "<div class='carousel-caption'>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='1.0s'>"
                    + "<h2>Simulador de juros</h2>"
                    + "</div>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='0.9s'>"
                    + "<form class='form-inline'>"
                    + "<div class='form-group'>"
                    + "<a  href='juros-simples' button type='livedemo' name='Live Demo' "
                    + "class='btn btn-primary btn-lg' required='required'>Juros Simples</button></a>"
                    + "</div>"
                    + "<div class='form-group'>"
                    + "<a  href='juros-composto' button type='getnow' name='Get Now' "
                    + "class='btn btn-primary btn-lg' required='required'>Juros Composto</button></a>"
                    + "</div>"
                    + "</form>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='item'>"
                    + "<img src='img/1.jpg' class='img-responsive' alt=''>"
                    + "<div class='carousel-caption'>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='1.0s'>"
                    + "<h2>Simulador de juros</h2>"
                    + "</div>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='1.6s'>"
                    + "<form class='form-inline'>"
                    + "<div class='form-group'>"
                    + "<a  href='juros-simples' button type='livedemo' name='purchase' class='btn btn-primary btn-lg' required='required'>Juros Simples</button></a>"
                    + "</div>"
                    + "<div class='form-group'>"
                    + "<a  href='juros-composto'    button type='getnow' name='subscribe' class='btn btn-primary btn-lg' required='required'>Juros Composto</button>"
                    + "</div>"
                    + "</form>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<a class='left carousel-control hidden-xs' href='#carousel-slider' data-slide='prev'>"
                    + "<i class='fa fa-angle-left'></i> "
                    + "</a>"
                    + "<a class='right carousel-control hidden-xs' href='#carousel-slider' data-slide='next'>"
                    + "<i class='fa fa-angle-right'></i>"
                    + "</a>"
                    + "</div> <!--/#carousel-slider-->"
                    + "</div><!--/#about-slider-->"
                    + "</div><!--/#slider-->"
                    + "<div id='team'>"
                    + "<div class='container'>"
                    + "<div class='row'>"
                    + "<div class='text-center'><br><br><br>"
                    + "<hr>"
                    + "<h2>DISCIPLINA PROGRAMAÇÃO ORIENTADA A OBJETOS -POO.</h2>"
                    + "<p>SITE criado para calcular juros simples e juros composto, contendo HOME e mais duas páginas para cada cálculo."
                    + "Usando SERVLETS, IDE NETBEANS, JAVA, BOOTSTRAP e GITHUB.</p>"
                    + "<hr>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInRight' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect' align='center'>"
                    + "<img src='img/team/team1.jpg' class='img-responsive' width='250' height='250'>"
                    + "<h2>RICARDO PUPO LARGUESA</h2>"
                    + "<p>Docente na Fatec - Praia Grande<br> CO-Founder da T2S Soluções<br> Idealizador do SITE</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInRight' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect' align='center'>"
                    + "<img src='img/team/team2.jpg' class='img-responsive' align='center' width='250' height='250'>"
                    + "<h2>NILTON MITSUHARU SUGAWARA</h2>"
                    + "<p>Discente na Fatec - Praia Grande<br> Técnico Mecatrônica ETEC - SV<br> Analista Q.A. na GlobalTI</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInLeft' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect' align='center'>"
                   + "<img src='img/team/team3.jpg' class='img-responsive' align='center' width='250' height='250'>"
                    + "<h2>TIAGO THOMAS<br> DIAS</h2>"
                    + "<p>Discente na Fatec - Praia Grande<br> Técnico Informática ETEC - PG<br> Aux. Geral no Jack e Japa Beer</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInLeft' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect' align='center'>"
                    + "<img src='img/team/team4.jpg' class='img-responsive' align='center' width='250' height='250'>"
                    + "<h2>JOSÉ CORDEIRO MOURA JÚNIOR</h2>"
                    + "<p>Discente na Fatec - Praia Grande<br> Técnico Informática ETEC - SV<br> Analista Q.A. na GlobalTI</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<footer>"
                    + "<div class='social-icon'>"
                    + "<div class='container'>"
                    + "<div class='col-md-6 col-md-offset-3'>"
                    + "<ul class='social-network'>"
                    + "<li><a href='https://www.facebook.com/Calculadora-de-Juros-162706771112325/' class='fb tool-tip' title='Facebook'><i class='fa fa-facebook'></i></a></li>"
                    + "<li><a href='https://twitter.com/calculo_juros' class='twitter tool-tip' title='Twitter'><i class='fa fa-twitter'></i></a></li>"
                    + "<li><a href='https://www.linkedin.com/in/calculadora-de-juros-03ab3a160/' class='linkedin tool-tip' title='Linkedin'><i class='fa fa-linkedin'></i></a></li>"
                    + "</ul>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='text-center'>"
                    + "<div class='copyright'>"
                    + "&copy; 2018 <a target='_blank' href='http://bootstraptaste.com/' title='Free Twitter Bootstrap WordPress Themes and HTML templates'>-The Three Musketeers-"
                    + "</a>. All Rights Reserved."
                    + "</div>"
                    + "</div>"
                    + "</footer>"
                    + "<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->"
                    + "<script src='js/jquery-2.1.1.min.js'></script>"
                    + "<!-- Include all compiled plugins (below), or include individual files as needed -->"
                    + "<script src='js/bootstrap.min.js'></script>"
                    + "<script src='js/parallax.min.js'></script>"
                    + "<script src='js/wow.min.js'></script>"
                    + "<script src='js/jquery.easing.min.js'></script>"
                    + "<script type='text/javascript' src='js/fliplightbox.min.js'></script>"
                    + "<script src='js/functions.js></script>"
                    + "<script>"
                    + "wow = new WOW("
                    + "{"
                    + "}"
                    + ")"
                    + ".init();"
                    + "</script>"
                    + "</body>"
                    + "</html>");

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
