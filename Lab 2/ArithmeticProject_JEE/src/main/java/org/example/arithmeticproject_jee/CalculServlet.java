package org.example.arithmeticproject_jee;


import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;

@WebServlet(name = "CalculServlet", urlPatterns = {"/Calculate"})
public class CalculServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Retrieve form data
            int value1 = Integer.parseInt(request.getParameter("value1"));
            int value2 = Integer.parseInt(request.getParameter("value2"));
            String operation = request.getParameter("operation");

            // Use the JavaBean
            ArithmeticBean arithmeticBean = new ArithmeticBean();
            arithmeticBean.setValue1(value1);
            arithmeticBean.setValue2(value2);

            // Determine the operation
            int result;
            switch (operation) {
                case "add":
                    result = arithmeticBean.add();
                    break;
                case "subtract":
                    result = arithmeticBean.subtract();
                    break;
                case "multiply":
                    result = arithmeticBean.multiply();
                    break;
                case "divide":
                    result = arithmeticBean.divide();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
            }

            // Display result
            response.setContentType("text/html");
            response.getWriter().write("<html><body>");
            response.getWriter().write("<h2>Result: " + result + "</h2>");
            response.getWriter().write("<a href=\"index.jsp\">Go Back</a>");
            response.getWriter().write("</body></html>");
        } catch (Exception e) {
            response.setContentType("text/html");
            response.getWriter().write("<html><body>");
            response.getWriter().write("<h2>Error: " + e.getMessage() + "</h2>");
            response.getWriter().write("<a href=\"index.jsp\">Go Back</a>");
            response.getWriter().write("</body></html>");
        }
    }
}
