package com.srsuporte.srsptfx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Alex
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/view/FXMLVBoxMain.fxml"));
        
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");
            System.out.println("CSS carregado!");
       
        
        System.out.println("com.srsuporte.srsptfx.Main.start()");
        
        
        stage.setScene(scene);
        stage.setTitle("Sr Suporte");
        stage.setResizable(false);
        stage.show();
        
        
                 
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
