package servlets;

import model.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonathan on 3-9-15.
 */
@WebServlet(name = "UsersServlet")
public class UsersServlet extends HttpServlet {



    private List<User> users = new ArrayList<>();


    private void readUsers() throws Exception {


        File f = new File("accounts.xml");
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
            }

            if(role.equals("verhuurder")){

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

    private void writeUsers() throws ParserConfigurationException, IOException, SAXException {
//
//        File f = new File("accounts.xml");
//        assert f != null : "file is null";
//
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(f);
//        doc.getDocumentElement().normalize();
//
//
//        Element rootElement = doc.createElement("users");
//        doc.appendChild(rootElement);
//
//        for(User u : users){
//            rootElement.appendChild(doc.createElement("user"))
//
//            doc.createElement("user");
//
//
//        }

    }


    @Override
    public void init() throws ServletException {
        super.init();


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
