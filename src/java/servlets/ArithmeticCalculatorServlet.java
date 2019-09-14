package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794471
 */
public class ArithmeticCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("result", "---");
                
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String str = request.getParameter("numOne");
        String str2 = request.getParameter("numTwo");
        
        String op = request.getParameter("operation");
        
        int x = 0;
        int y = 0;
        
        try
        {
            x = Integer.valueOf(str);
            y = Integer.valueOf(str2);
            int z = 0;
            
            if(op.equals("+"))
            {
                z = x + y;
            }
            else if(op.equals("-"))
            {
                z = x - y;
            }
            else if(op.equals("*"))
            {
                z = x * y;
            }
            else
            {
                z = x % y;
            }
            
            request.setAttribute("result", z);
        }
        catch(NumberFormatException e)
        {
            request.setAttribute("result", "invalid");
        }
                             
        request.setAttribute("num1", str);
        request.setAttribute("num2", str2);
       
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}
