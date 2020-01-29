package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController {
	
	

	    @FXML
	    private Button btnLogin;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtPassword;
	    
	    
	    @FXML
	    private boolean siguiente=false;
	    
	    @FXML
	    void login(ActionEvent event) {
	    	//Creamos la alerta que aparecerá para decirnos si hemos introducido bien las credenciales
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Información");
	    	alert.setHeaderText(null);
	    	
	    	//Variables ficticias para emular un inicio de sesión
	    	String email = "prueba@gmail.com";
	    	String password = "123456";
	    	
	    	//Comprobamos si coinciden los datos del login
	    	if(txtEmail.getText().equals(email) && txtPassword.getText().equals(password)) {
	    		//Si coincide, nos muestra el siguiente mensaje
	    		alert.setContentText("Ha iniciado sesión correctamente");
	    		
	    		Stage stage = new Stage();
	    		Parent root= null;
	    		try {
	    			root = FXMLLoader.load(getClass().getResource("SecondView.fxml"));
	    					
	    		} catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    		Scene escena = new Scene(root);
	    		stage.setScene(escena);
	    		stage.show();
	    		
	    		
	    	}else {
	    		//Si no hemos escrito bien nuestra credenciales, nos muestra este otro
	    		alert.setContentText("Email y/o contraseña incorrectos");
	    		System.out.println(email +" "+password+" "+txtEmail.getText()+" "+txtPassword.getText()+" ");
	    	}
	    	
	    	alert.showAndWait();
	    	 
	    }
	   
	    
	    
	    
	 }

	

