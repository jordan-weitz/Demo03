/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jweit
 */
public class HelloWorldServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this will display the requested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
    }


    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from the POST request (the form)
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        
        //set the attribute for the JSP
        request.setAttribute("firstName", firstname);
        request.setAttribute("lastName", lastname);
        
        //display the helloWorld 
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorld.jsp").forward(request, response);
        
    }


}
