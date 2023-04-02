package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "redirectpage", urlPatterns = {"/redirectpage"})
public class redirectpage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Cookie ck[]=request.getCookies();
        String user_lang=ck[0].getValue();
        try(PrintWriter out = response.getWriter())
        {
       
            if(user_lang.equalsIgnoreCase("Tamil"))
            {
                out.println("<!DOCTYPE HTML>");
                out.println("<html>");
                out.println("<body style='background-color:Cyan'>");
                out.println("<center><img src='http://1.bp.blogspot.com/-rs8YR39dyss/TmZ6--s0sPI/AAAAAAAAIfM/Zo4Pb6LSu2I/s1600/Welcome+Images+Pictures+%2526+Photos+with+Messages+in+Tamil.JPG' height='500' width='500'></center>");
                out.println("<h1 style='text-align:center'> Thank You For Choosing "+user_lang+" language</h1>");
                out.println("</body>");
                out.println("</html");
            }
            if(user_lang.equalsIgnoreCase("English"))
            {
                out.println("<!DOCTYPE HTML>");
                out.println("<html>");
                out.println("<body style='background-color:YellowGreen'>");
                out.println("<center><img src='https://images.unsplash.com/photo-1600577916048-804c9191e36c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8d2VsY29tZXxlbnwwfHwwfHw%3D&w=1000&q=80' height='500' width='500' ></center>");
                out.println("<h1 style='text-align:center'> Thank You For Choosing "+user_lang+" language<h1>"); 
                out.println("</body>");
                out.println("</html");
            }
            if(user_lang.equalsIgnoreCase("Hindi"))
            {
                out.println("<!DOCTYPE HTML>");
                out.println("<html>");
                out.println("<body style='background-color:salmon'>");
                out.println("<center><img src='https://www.shutterstock.com/image-vector/hindi-calligraphic-card-design-swagatam-260nw-2097531904.jpg' height='500' width='500'></center>");
                out.println("<h1 style='text-align:center'> Thank You For Choosing "+user_lang+" language</h1>");
                out.println("</body>");
                out.println("</html");
            }
            if(user_lang.equalsIgnoreCase("Telugu"))
            {
                out.println("<!DOCTYPE HTML>");
                out.println("<html>");
                out.println("<body style='background-color:Moccasin'>");
                out.println("<center><img src='https://i.pinimg.com/736x/35/62/97/35629787b784353376601fe2fcd6adec.jpg' height='500' width='500' ></center>");
                out.println("<h1 style='text-align:center'> Thank You For Choosing "+user_lang+ " language</h1>");
                out.println("</body>");
                out.println("</html");
            }
            if(user_lang.equalsIgnoreCase("Malayalam"))
            {
                out.println("<!DOCTYPE HTML>");
                out.println("<html>");
                out.println("<body style='background-color:#FF8C00'>");
                out.println("<center><img src='https://i.etsystatic.com/17682989/r/il/1de275/3702233519/il_570xN.3702233519_fcm5.jpg' height='500' width='500' ></center>");
                out.println("<h1 style='text-align:center'> Thank You For Choosing "+user_lang+" language</h1>"); 
                out.println("</body>");
                out.println("</html");
            }
        }
       
     
    }
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
