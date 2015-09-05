package servlets;

import model.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.annotation.security.DeclareRoles;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by jonathan on 2-9-15.
 */
@DeclareRoles("huurder")
@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
        try {
            readUsers();
        } catch (Exception e) {

            //TODO catch

            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            //TODO login afhandelen



        // gegevens
        String username = request.getParameter("username");
        String password = request.getParameter("password");




        if(validUser(username, password)) username = "YEAH INGELOGD";

        // display
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<BIG>"+ username + password  + "</BIG>");
        out.println("</BODY></HTML>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<BIG>Hello World</BIG>");
        out.println("</BODY></HTML>");
    }

    private List<User> users = new ArrayList<>();


    private void readUsers() throws Exception {


        File f = new File("/home/jonathan/Dropbox/Studie/Jaar 2/Workspace/Webtechnologie/Kamerverhuur/accounts.xml");
        assert f != null : "file is null";

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(f);
        doc.getDocumentElement().normalize();

        Element rootElement = doc.getDocumentElement();

        NodeList l = rootElement.getElementsByTagName("user");


        for (int i = 0; i < l.getLength(); i++) {

            Element n = (Element) l.item(i);

            String username = n.getElementsByTagName("name").item(0).getTextContent();
            String password = n.getElementsByTagName("password").item(0).getTextContent();
            String role = n.getElementsByTagName("role").item(0).getTextContent();

            System.out.println("name = " + username);
            System.out.println("pass = " + password);
            System.out.println("role = " + role);

            if(role.equals("huurder")){

                users.add(new User(username, password, User.Role.HUURDER));
            }else if(role.equals("verhuurder")){

                users.add(new User(username, password, User.Role.VERHUURDER));
            }else{

                throw new Exception("invalid role in xml file");
            }

        }







    }

    public boolean validUser(String username, String password){


        for(User u : users){

            if(u.hasNameAndPass(username, password)){

                return true;
            }

        }
        return false;

    }


    public User getUser(String username, String password){

        assert validUser(username, password);
        for(User u : users){

            if(u.hasNameAndPass(username, password)){

                return u;
            }

        }

        return null;
    }



}
