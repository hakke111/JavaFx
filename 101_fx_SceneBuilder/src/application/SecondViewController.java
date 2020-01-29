package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SecondViewController {
	
	

	    @FXML
	    private Button btnLogin;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtPassword;
	    
	    @FXML
	    void login(ActionEvent event) {
	    	//Creamos la alerta que aparecer� para decirnos si hemos introducido bien las credenciales
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Informaci�n");
	    	alert.setHeaderText(null);
	    	
	    	//Variables ficticias para emular un inicio de sesi�n
	    	String email = "prueba@gmail.com";
	    	String password = "123456";
	    	
	    	//Comprobamos si coinciden los datos del login
	    	if(txtEmail.getText().equals(email) && txtPassword.getText().equals(password)) {
	    		//Si coincide, nos muestra el siguiente mensaje
	    		alert.setContentText("Ha iniciado sesi�n correctamente");
	    	}else {
	    		//Si no hemos escrito bien nuestra credenciales, nos muestra este otro
	    		alert.setContentText("Email y/o contrase�a incorrectos");
	    		System.out.println(email +" "+password+" "+txtEmail.getText()+" "+txtPassword.getText()+" ");
	    	}
	    	
	    	alert.showAndWait();
	    	
	    	
	    }

	}

