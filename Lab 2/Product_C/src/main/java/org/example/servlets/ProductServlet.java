package org.example.servlets;

import models.Product;
import models.ProductList;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;

@WebServlet(name = "ProductServlet", urlPatterns = {"/CalculateTotal"})
public class ProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve input data
        String productName = request.getParameter("productName");
        int quantity;
        try {
            quantity = Integer.parseInt(request.getParameter("quantity"));
        } catch (NumberFormatException e) {
            quantity = 0; // Default to 0 if invalid input
        }

        // Use the ProductList class to find the product
        ProductList productList = new ProductList();
        Product product = productList.findByName(productName);

        response.setContentType("text/html");
        response.getWriter().write("<html><body>");

        if (product != null && quantity > 0) {
            // Calculate total amount including tax (TTC)
            double totalAmountTTC = quantity * product.getPriceExcludingTax() * (1 + product.getVat());

            // Display the result
            response.getWriter().write("<h2>Product: " + product.getName() + "</h2>");
            response.getWriter().write("<h3>Total Amount (TTC): " + totalAmountTTC + " DT</h3>");
        } else {
            response.getWriter().write("<h3>Product not found or invalid quantity!</h3>");
        }

        response.getWriter().write("<a href=\"index.jsp\">Go Back</a>");
        response.getWriter().write("</body></html>");
    }
}
