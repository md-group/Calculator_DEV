package com.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calc extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane = FXMLLoader.load(getClass().getResource("CalcLayout.fxml"));
				
		Scene scene = new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("CalcStyle.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResourceAsStream("com/calculator/IconCalc.png")));
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
