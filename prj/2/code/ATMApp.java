import java.io.FileInputStream;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 * The main class for running the ATM GUI.
 * 
 * @author Michael Wise
 *
 */
public class ATMApp extends Application {
	
	Scene scene1, scene2;
	
	private TextField field = new TextField();
	private ATM atm = new ATM(new Bank());
	
	public static void main(String[] args) {
		launch(args);
	}
	
	// HBox on bottom of GUI
	public HBox addHBox(TextArea areaInfo) {
	    HBox hbox = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);
	    hbox.setStyle("-fx-background-color: #336699;");
		  
	    Label enterLabel = new Label("Enter amount:");
		// Log into the ATM, show account details
		areaInfo.setText(atm.toString());
		
		Button btnEnter = new Button("Confirm");
		btnEnter.setOnAction(e -> {
			int id = Integer.parseInt(field.getText());
			atm.login(id);
			
			areaInfo.setText(atm.toString());
			btnEnter.setDisable(true);
			btnEnter.setVisible(false);
			
		});
		
		Button btnDeposit = new Button("Deposit");
		btnDeposit.setOnAction(e -> {
			double amount = Double.parseDouble(field.getText());
			atm.deposit(amount);
			
			areaInfo.setText(atm.toString());
			
		});
		
		Button btnWithdraw = new Button("Withdraw");
		btnWithdraw.setOnAction(e -> {
			double amount = Double.parseDouble(field.getText());
			atm.withdraw(amount);
			
			areaInfo.setText(atm.toString());
			
		});
		
		Button btnExit = new Button("Exit");
		btnExit.setOnAction(e -> {
			atm.exit();
			
			areaInfo.setText(atm.toString());
			btnEnter.setDisable(false);
			btnEnter.setVisible(true);
		});
		
		hbox.getChildren().addAll(enterLabel, field, btnEnter, btnDeposit, btnWithdraw, btnExit);
	    return hbox;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// First scene
		GridPane root = new GridPane();
		root.setPadding(new Insets(10,10,10,10));
		root.setVgap(8);
        root.setHgap(10);
        
        // ID Label - constrains use (child, column, row)
        Label idLabel = new Label("Bank Account ID:");
        GridPane.setConstraints(idLabel, 0, 0);

        // ID Input
        TextField idInput = new TextField();
        idInput.setPromptText("Enter your account ID number (5 digits)");
        GridPane.setConstraints(idInput, 1, 0);
        
        // Name Label
        Label passLabel = new Label("Name(optional):");
        GridPane.setConstraints(passLabel, 0, 1);

        // Name Input
        TextField nameInput = new TextField();
        nameInput.setPromptText("Enter your name");
        GridPane.setConstraints(nameInput, 1, 1);

        // Message
        Label logMessage = new Label("");
        GridPane.setConstraints(logMessage, 0, 2);
        // Login
        Button btnLogin = new Button("Log In");
        GridPane.setConstraints(btnLogin, 1, 2);
		btnLogin.setOnAction(e -> {
			int id = Integer.parseInt(idInput.getText());
			atm.login(id);
			AccountInfo info = atm.getInfo();
			
			// If entered ID matches with existing account, logs user in
			if (info != null) {
				if (info.getAccountId() != id) {
		            logMessage.setText("Incorrect info!");
				} else { primaryStage.setScene(scene2); }
			} else {
				logMessage.setText("Incorrect info!");
			}

		});

        root.getChildren().addAll(idLabel, idInput, passLabel, nameInput, logMessage, btnLogin);
		Scene scene1 = new Scene(root, 350, 150);
		
		// Assets of scene 2 with a root of BorderPane
		BorderPane border = new BorderPane();
		TextArea areaInfo = new TextArea();
		areaInfo.setEditable(false);
		areaInfo.setPrefHeight(500);  // sets height of the TextArea to 500 pixels 
		areaInfo.setPrefWidth(400);   // sets width of the TextArea to 400 pixels
		HBox hbox = addHBox(areaInfo);
		VBox vbox = new VBox(30);
		vbox.setStyle("-fx-background-color: #4997DE;");
		Image image = new Image(new FileInputStream("atm.png"));
		ImageView imageView = new ImageView(image); 
		imageView.setFitHeight(200); 
	    imageView.setFitWidth(300);
	    Label adMessage = new Label("We value your time using Wise ATM!");
	    adMessage.setTextFill(Color.web("#FFFFFF"));
		vbox.getChildren().addAll(imageView, adMessage);
		border.setBottom(hbox);
		border.setLeft(areaInfo);
		border.setRight(vbox);
		scene2 = new Scene(border, 650, 350);
		
		// Tells program to start with first scene
		primaryStage.setScene(scene1);
		primaryStage.setTitle("ATM by Michael Wise");
		primaryStage.show();
		
	}

	

	
}
