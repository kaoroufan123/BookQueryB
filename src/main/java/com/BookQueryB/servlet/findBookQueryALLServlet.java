package com.BookQueryB.servlet; /**
 * @ClassName ${Name}
 * @Author KaoRouFan
 * @Date 2023/6/14 上午 10:35
 * @Version 1.0
 */

import com.BookQueryB.entity.BookQuery;
import com.BookQueryB.service.BookQueryService;
import com.BookQueryB.service.impl.BookQueryServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findBookQueryALLServlet", urlPatterns = {"/findBookQueryALLServlet"})
public class findBookQueryALLServlet extends HttpServlet {
    private BookQueryService bookQueryService = new BookQueryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        List<BookQuery> list = bookQueryService.findBookQuery(null,null,"历史");
        req.setAttribute("list",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
