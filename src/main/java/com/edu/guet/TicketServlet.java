package com.edu.guet; /**
 * Created with IntelliJ IDEA.
 *
 * @Author: fanFengLi
 * @Date: 2023/05/07/16:11
 * @Description:
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("余票查询");
        request.setCharacterEncoding("UTF-8");
        String fromStation = request.getParameter("fromStation");
        String toStation = request.getParameter("toStation");
        String departureDate = request.getParameter("departureDate");

        String allTicket = TicketSearch.search(fromStation, toStation, departureDate);
        response.setContentType("application/json;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
