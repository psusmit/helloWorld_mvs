package upGrad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {
//    use generic method serves all get,post,delete
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<!Doctype html>");
        printWriter.print("<html>");
        printWriter.print("<head>");
        printWriter.print("<title>Hello World Servlet!</title>");
        printWriter.print("</head>");
        printWriter.print("<body>");
        printWriter.print("<p>Hello World!</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }
}
