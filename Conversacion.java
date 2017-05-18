import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;

import javafx.geometry.Pos;

public class Conversacion extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new Group());
        
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Conversacion");
        
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        
        Label labelNombre = new Label("Nombre:");
        TextField campoNombre = new TextField();
        
        Label labelComentario = new Label("Comentario:");
        TextField campoComentario = new TextField();
        
        Button btn = new Button("Enviar");
        btn.setOnAction((event) -> {
            String usuarioActual = campoNombre.getText();
            String comentarioActual = campoComentario.getText();
            if(usuarioActual.length() > 0 && comentarioActual.length() > 0){
                Label entrada = new Label (new Comentario(usuarioActual, comentarioActual).toString());
                vbox.getChildren().add(entrada);
            }
            campoNombre.clear();
            campoComentario.clear();
        });
        
        vbox.getChildren().addAll(labelNombre, campoNombre, labelComentario, campoComentario, btn);
        
        ((Group)scene.getRoot()).getChildren().add(vbox);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
