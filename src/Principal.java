/** ******.********************************************************
 * Autor...........: Pedro Lucca Silva Martins
 * Matricula........: 202210183
 * Inicio...........: 20/11/2023
 * Ultima alteracao.: 04/11/2023
 * Nome.............: Classe principal
 * Funcao...........: Executar o programa
 *************************************************************** */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
  
  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
    
    Scene scene = new Scene(root);
    
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
  
}
