package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "movie", urlPatterns = {"/movie"})
public class movie extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String s=request.getParameter("film");
        try (PrintWriter out = response.getWriter()) {
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet movie</title>");            
            out.println("</head>");
            out.println("<body>");
           if(s.equals("Thalapathy vijay"))
            {
                out.println("<div>");
                out.println("<img style='float:left' src='https://static.toiimg.com/thumb/msid-88092020,width-400,resizemode-4/88092020.jpg' height='500px' width='700px'>");
                out.println("<img src='https://m.media-amazon.com/images/M/MV5BZWJlODhlMzctOTU0Yi00MTUwLTkxODYtMDNjNTQxYTI2YTE1XkEyXkFqcGdeQXVyMTEzNzg0Mjkx._V1_.jpg' height='500px' width='745px' >");
                out.println("<table border='20' width='1450px'height='240px' ><tr><th>filmname</th><th>Year</th><th>Director</th><th>Music Director</th>");
                   out.println("<tr><td>Leo</td><td>2023</td><td>Lokesh kanagaraj</td><td>Anirudh Ravichandar</tr>");
                   out.println("<tr><td>Bigil</td><td>2019</td><td>Atlee</td><td>A.R.Rahman</td></tr>");
                   out.println("<tr><td>Master</td><td>2021</td><td>Lokesh Kanagaraj</td><td>Anirudh Ravichandar</td></tr>");
                   out.println("<tr><td>Sarkar</td><td>2018</td><td>A.R.Murugadoss</td><td>A.R.Rahman</td</tr>");
                   out.println("<tr><td>Varisu</td><td>2023</td><td>Vamshi paidaipalley</td><td>Thaman</td></tr></table>");
                out.println("</div>");
            }
            if(s.equals("Thala Ajith"))
            {
                out.println("<div>");
                out.println("<img style='float:left' src='https://play-lh.googleusercontent.com/DrRZFuzy3hd292vVGRiVwKE6NvMpVNRCE6DtMHvkPQChbdl4OY3mlzRIRN96cftagGU'height='500px' width='700px'>");
                out.println("<img src='https://s3.ap-southeast-1.amazonaws.com/images.deccanchronicle.com/dc-Cover-aaodogv8cdbdclj5ihlv9oagl5-20200611193610.Medi.jpeg' height='500px' width='745px'>");
                out.println("<table border='20' width='1450px'height='240px' ><tr><th>filmname</th><th>Year</th><th>Director</th><th>Music Director</th>");
                out.println("<tr><td>Thunviu</td><td>2023</td><td>H.Vinodh</td><td>Zhibran</tr>");
                out.println("<tr><td>Viswasam</td><td>2019</td><td>Siva</td><td>D.Imman</tr>");
                out.println("<tr><td>Valimai</td><td>2022</td><td>H.Vinodh</td><td>Yuvan shankar Raja</tr>");
                out.println("<tr><td>Billa</td><td>2007</td><td>VishnuVardhan</td><td>Yuvan Shankar Raja</tr>");
                out.println("<tr><td>Nerkonda Paarvai</td><td>2018</td><td>H.VInodh</td><td>Yuvan Shankar Raja</tr></table>");
               
            }
            if(s.equals("Frog Surya"))
            {
                out.println("<div>");
                out.println("<img style='float:left' src='https://i.pinimg.com/originals/5e/c3/96/5ec3962ea890f31d67b70b49ad759df1.jpg'height='500px' width='720px'>");
                out.println("<img src='https://wallpapercave.com/wp/wp5912669.jpg' height='500px' width='720px' >");
                out.println("<table border='20' width='1450px' height='240px' ><tr><th>filmname</th><th>Year</th><th>Director</th><th>Music Director</th>");
                out.println("<tr><td>JaiBhim</td><td>2021</td><td>T.J.Gnanavel</td><td>Sean Roldan</tr>");
                out.println("<tr><td>Etharkum Thunindhavan</td><td>2022</td><td>Pandiraj</td><td>D.Imman</tr>");
                out.println("<tr><td>Soorarai Pottru</td><td>2020</td><td>Sudha Kongara Prasad</td><td>G.V.Prakash Kumar</tr>");
                out.println("<tr><td>Vickram</td><td>2022</td><td>Lokesh Kanagaraj</td><td>Anirudh Ravichandar</tr>");
                out.println("<tr><td>Ayan</td><td>2008</td><td>K.V.Anand</td><td>Harris Jeyaraj </tr></table>");
                out.println("</div>");
            }
            if(s.equals("Dhanush"))
            {
                out.println("<div>");
                out.println("<img src='https://www.filmibeat.com/ph-big/2022/07/dhanush_165778903530.jpg'height='500px' width='720px'>");
                out.println("<img src='https://www.pinkvilla.com/imageresize/dhanush_selvaraghavan_movies.jpg?width=752&t=pvorg'height='500px' width='720px'>");
                out.println("<table  border='20' width='1450px' height='240px' ><tr><th>filmname</th><th>Year</th><th>Director</th><th>Music Director</th>");
                out.println("<tr><td>Naane Varuven</td><td>2022</td><td>Selvaragavan</td><td>Yuvan Shankar Raja</tr>");
                out.println("<tr><td>Thiruchitrambalam</td><td>2022</td><td>Mithran K.Jawahar</td><td>Anirudh Ravichandar</tr>");
                out.println("<tr><td>Vaathi</td><td>202e</td><td>Venky Atluri</td><td>G.V.Prakash Kumar</td></tr>");
                out.println("<tr><td>Pudhupettai</td><td>2006</td><td>Selvaraghavan</td><td>Yuvan Shankar Raja</tr>");
                out.println("<tr><td>Asuran</td><td>2019</td><td>Vettrimaran</td><td>G.V.Prakash Kumar</tr></table");
                out.println("</div>");
               
            }
            out.println("</body>");
            out.println("</html>");
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
