package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.CatalogueMetierImpl;
import metier.Facture;
import metier.Generateur;
import metier.ICatalogueMetier;
import metier.LogModel;
import metier.SingletonConnexion;


/**
 * Servlet implementation class ControleurServelet
 */
public class ControleurServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private ICatalogueMetier metier;  
    
    public ControleurServelet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException{
    	metier =new CatalogueMetierImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("acceuil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	LogModel log = new LogModel();
		request.setAttribute("log", log);
		
		SignModel sign = new SignModel();
		request.setAttribute("sign", sign);
*/
		
		FactureModel model=new FactureModel();
		request.setAttribute("model", model);
		String action= request.getParameter("action");
		
		if (action != null) {
			
			
		if (action.equals("chercher")) {
			
			model.setMotCle(request.getParameter("motCle"));
			List<Facture> factures=metier.listFacturesMC(model.getMotCle());
			model.setFactures(factures);
			request.getRequestDispatcher("acceuil.jsp").forward(request, response);
		/*	 Generateur g=new Generateur();
		     g.Generer(90, 1, 1, 1);
		     request.getRequestDispatcher("saisie.jsp").forward(request, response); */
			}
	
		
		
		else if (action.equals("delete")) {
			
			
				int facture_id= Integer.parseInt(request.getParameter("facture_id"));
				metier.deleteFacture(facture_id);
				List<Facture> factures=metier.listFactures();
				model.setFactures(factures);
				request.getRequestDispatcher("acceuil.jsp").forward(request, response);
		}
		
		
		
		else if (action.equals("Importer")) {
			request.getRequestDispatcher("acceuil.jsp").forward(request, response);
		}
		
		
		
		else if (action.equals("generer")) {	
			String If=request.getParameter("IF");
			int annee=Integer.parseInt(request.getParameter("annee"));
			String regime=request.getParameter("regime");
			int re=1;
			int pe=1;
			switch(regime) {
			case "Mensuel" : re=1;
			
			break;
			case "Trimistriel" : re=2;
			break;
			}
			String periode=request.getParameter("periode");
			switch(periode) {
			case "Janvier" : pe=1;
			break;
			case "fevrier" : pe=2;
			break;
			case "Mars" : pe=3;
			break;
			case "Avril" : pe=4;
			break;
			case "Mai" : pe=5;
			break;
			case "Juin" : pe=6;
			break;
			case "Juillet" : pe=7;
			break;
			case "August" : pe=8;
			break;
			case "Septembre" : pe=9;
			break;
			case "Octobre" : pe=10;
			break;
			case "Novembre" : pe=11;
			break;
			case "Decembre" : pe=12;
			break;
			}
		    Generateur g=new Generateur();
		    
		    g.Generer(If, annee, pe, re);
		    
	        request.getRequestDispatcher("acceuil.jsp").forward(request, response);
			
		}
	
		
		else if (action.equals("login")){
			
			    String email= request.getParameter("login-email");
		        String password = request.getParameter("login-password");
		        
		        HttpSession session = request.getSession();

		       
		        Connection co=SingletonConnexion.getConnection();
		       
		       
		        Statement st;
				try {
					st = co.createStatement();
				
		        ResultSet rs;
		        rs = st.executeQuery("select * from utilisateur where login='" + email + "' and password='" + password + "'");
		        if (rs.next()) {
		            session.setAttribute("login_email", email);
		            //out.println("welcome " + userid);
		            //out.println("<a href='logout.jsp'>Log out</a>");
		            request.getRequestDispatcher("acceuil.jsp").forward(request, response);
		        } else {
		        	
					    
		        	request.getRequestDispatcher("login_full.html").forward(request, response);
		        }
			
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		else if (action.equals("register")){
			
		     	String name= request.getParameter("register-lastname");
			    String email= request.getParameter("register-email");
		        String password = request.getParameter("register-password");
		        
		        
		        HttpSession session = request.getSession();
		        Connection co=SingletonConnexion.getConnection();
     
		        Statement st;
				try {
					st = co.createStatement();

		        int i = st.executeUpdate("insert into utilisateur(name, login, password) values ('" + name + "' , '" + email + "' , '" + password + "')");
		        if (i > 0) {
		         	session.setAttribute("register-lastname", name);
			        session.setAttribute("register-email", email);
			        session.setAttribute("register-password", password);
			        
		            //session.setAttribute("userid", user);
		        	request.getRequestDispatcher("acceuil.jsp").forward(request, response);
		           // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
		        } else {
		         	request.getRequestDispatcher("login_full.html").forward(request, response);
		        }
		        
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		else if (action.equals("logout")){
			 HttpSession session = request.getSession();
			session.setAttribute("login_email", null);
			session.invalidate();
			request.getRequestDispatcher("login_full.html").forward(request, response);
		}
		
		else if (action.equals("Ajouter")) {
			try {
			model.getFacture().setDesignation(request.getParameter("des"));
			model.getFacture().setNum_facture(Integer.parseInt(request.getParameter("num_facture")));
			model.getFacture().setOrdre(Integer.parseInt(request.getParameter("ordre")));
			model.getFacture().setTtc(Float.parseFloat(request.getParameter("ttc")));
			model.getFacture().setMht(Float.parseFloat(request.getParameter("mht")));
			model.getFacture().setTva(Float.parseFloat(request.getParameter("tva")));
			model.getFacture().setTax(Float.parseFloat(request.getParameter("tax")));
			model.getFacture().setIff(request.getParameter("idf"));
			model.getFournisseur().setIff(request.getParameter("idf"));
			model.getFournisseur().setIce(request.getParameter("ice"));
			model.getFournisseur().setNom(request.getParameter("namef"));
			String paiment=request.getParameter("paiment");
			int p=1;
			switch(paiment) {
			case "espece" : p=1;
			
			
			case "cheque" : p=2;
			
			
			case "prelevement" : p=3;
			
			
			case "virement" : p=4;
		
			
			case "effet" : p=5;
			
			
			case "compensation" : p=6;
			
			
			case "autres" : p=7;
			
			
			}
			model.getFacture().setId_paiment(p);
		/*	Date d=(Date) new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date_paiment"));
			model.getFacture().setDate_pai(d);
			Date d2=(Date) new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date_facture"));
			model.getFacture().setDate_fac(d2);   */
			
	    //	model.setMode(request.getParameter("mode"));
			
		//	if(model.getMode().equals("add")) {
		     	metier.addFournisseur(model.getFournisseur());
				metier.addFacture(model.getFacture());	
			
			//
			//else if(model.getMode().equals("add")) {
			//	metier.updateFacture(model.getFacture());
		//	}
			model.setFactures(metier.listFactures());
			request.getRequestDispatcher("acceuil.jsp").forward(request, response);
	}catch (Exception e) {
		model.setMsgErr(e.getMessage());
	}
		}
		
		
		
		else if (action.equals("Edit")) {
			String des=request.getParameter("designation");
			Facture f=metier.getFacture(des);
			
			model.setMode("edit");
			request.getRequestDispatcher("ajouter.jsp").forward(request, response);
			model.setFacture(f);
			model.setFactures(metier.listFactures());
		
		}
		
		
		}

}}
