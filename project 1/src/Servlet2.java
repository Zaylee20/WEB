import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
   request.setCharacterEncoding("utf-8");
   response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        Integer integer=(Integer)session.getAttribute(s: "saveNumber");
        int guessno = Integer.parseInt(request.getParameter(s: "guessno"));
        int guesses =0;


        int realno= integer;
        System.out.println(realno);
        System.out.println(guessno);

        if (guessno > 80) {
            session.setAttribute( s: "message", o: "guess big");
            System.out.println("big no");
            response.sendRedirect( s: "inputno.jsp");
        }else if (guessno<80){
            session.setAttribute( s: "message",o: "guess small");
            System.out.println("small no");
            response.sendRediret(s: "inputno.jsp");
        }else{
            session.setAttribute( s: "message", o: "guess right");
            System.out.println("Right");
            response.sendRedirect( s: "inputno.jsp");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
