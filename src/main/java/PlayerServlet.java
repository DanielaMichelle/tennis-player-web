import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
//@WebServlet(urlPatterns = "/")
public class PlayerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String playerName = request.getParameter("name");
        System.out.println(playerName + "get");
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String playerName = request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("name", playerName);
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
    }
}
