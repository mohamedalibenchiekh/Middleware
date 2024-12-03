package org.example.middleware_lab2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;

// Define the Servlet with URL pattern
@WebServlet(name = "ServletSearch", urlPatterns = {"/Find"})
public class ServletSearch extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the search keyword
        String keyword = request.getParameter("keyword");

        // Retrieve the selected search engine
        String searchEngine = request.getParameter("searchEngine");

        // Define base URLs for search engines
        String googleSearch = "https://www.google.com/search?q=";
        String bingSearch = "https://www.bing.com/search?q=";
        String askSearch = "https://fr.ask.com/web?q=";

        String searchURL;

        // Determine the search URL based on selected search engine
        switch (searchEngine) {
            case "Google":
                searchURL = googleSearch + keyword;
                break;
            case "Bing":
                searchURL = bingSearch + keyword;
                break;
            case "ASK":
                searchURL = askSearch + keyword;
                break;
            default:
                searchURL = googleSearch + keyword; // Default to Google if none selected
        }

        // Redirect the response to the determined URL
        response.sendRedirect(searchURL);
    }
}
