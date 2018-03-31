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
                    +"<li class=\'active\'><a href=\'#header\'>HOME</a></li>"
                    + "<li><a href=\'juros-simples\'>SIMPLES</a></li>"
                    + "<li><a href=\'juros-composto\'>COMPOSTO</a></li>"
                    + "<li><a href=\'#sobre\'>SOBRE</a></li>"
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
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<h2><span>Simule o juros da sua compra</span></h2>"
                    + "</div>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='0.6s'>"
                    + "<p>Comece por aqui</p>"
                    + "</div>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='0.9s'>"
                    + "<form class='form-inline'>"
                    + "<div class='form-group'>"
                    + "<button type='livedemo' name='Live Demo' "
                    + "class='btn btn-primary btn-lg' required='required'>Juros Simples</button>"
                    + "</div>"
                    + "<div class='form-group'>"
                    + "<button type='getnow' name='Get Now' "
                    + "class='btn btn-primary btn-lg' required='required'>Juros Compostos</button>"
                    + "</div>"
                    + "</form>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='item'>"
                    + "<img src='img/1.jpg' class='img-responsive' alt=''>"
                    + "<div class='carousel-caption'>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='1.0s'>"
                    + "<h2>Simule o juros da sua compra</h2>"
                    + "</div>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='1.3s'>"
                    + "<p>Comece por aqui</p>"
                    + "</div>"
                    + "<div class='wow fadeInUp' data-wow-offset='0' data-wow-delay='1.6s'>"
                    + "<form class='form-inline'>"
                    + "<div class='form-group'>"
                    + "<button type='livedemo' name='purchase' class='btn btn-primary btn-lg' required='required'>Juros Simples</button>"
                    + "</div>"
                    + "<div class='form-group'>"
                    + "<button type='getnow' name='subscribe' class='btn btn-primary btn-lg' required='required'>Juros Composto</button>"
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
                    + "<div id='sobre'>"
                    + "<div class='container'>"
                    + "<div class='row'>"
                    + "<div class='text-center'>"
                    + "<h3>Disciplina programação orientada objeto</h3>"
                    + "<p>TP2 - Site criado para calcular juros simples e juros composto,"
                    + "usando Servlets, IDE NetBeans, Java, Bootstrap e GITHUB.</p>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInRight' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect'>"
                    + "<i class='fa fa-laptop'></i>"
                    + "<h2>Professor Ricardo Pupo Larguesa</h2>"
                    + "<p>WDEFRGTHYJUYHTGRFEDFRGTHYJ</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInRight' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect'>"
                    + "<i class='fa fa-heart-o'></i>"
                    + "<h2>Retina Ready</h2>"
                    + "<p>Lorem ipsum dolor sit amet consectetur adipisicing</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInLeft' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect'>"
                    + "<i class='fa fa-cloud'></i>"
                    + "<h2>Easily Customize</h2>"
                    + "<p>Lorem ipsum dolor sit amet consectetur adipisicing</p>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-3 wow fadeInLeft' data-wow-offset='0' data-wow-delay='0.3s'>"
                    + "<div class='text-center'>"
                    + "<div class='hi-icon-wrap hi-icon-effect'>"
                    + "<i class='fa fa-camera'></i>"
                    + "<h2>Quality Code</h2>"
                    + "<p>Lorem ipsum dolor sit amet consectetur adipisicing</p>"
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
                    + "<li><a href='#' class='fb tool-tip' title='Facebook'><i class='fa fa-facebook'></i></a></li>"
                    + "<li><a href='#' class='twitter tool-tip' title='Twitter'><i class='fa fa-twitter'></i></a></li>"
                    + "<li><a href='#' class='linkedin tool-tip' title='Linkedin'><i class='fa fa-linkedin'></i></a></li>"
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
