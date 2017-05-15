import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;

import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;


/**
 * Write a description of class Conversacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversacion extends Application
{
    
    public Conversacion()
    {
        
    }

    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Conversacion");
        BorderPane contenedor = new BorderPane();
        
        
        Button btn = new Button("Enviar");
        btn.setOnAction((event) -> {
            Label comentario = new Label("test");
            comentario.setLayoutY(300);
            comentario.setLayoutX(300);
            contenedor.getChildren().add(comentario);
            primaryStage.show();
        });
        
        Label labelNombre = new Label("Nombre:");
        TextField campoNombre = new TextField();
        HBox cajaNombre = new HBox();
        cajaNombre.getChildren().addAll(labelNombre, campoNombre);
        cajaNombre.setSpacing(10);
        
        Label labelComentario = new Label("Comenrario:");
        TextField campoComentario = new TextField();
        
        FlowPane cajaComentario = new FlowPane(Orientation.VERTICAL);
        cajaComentario.setVgap(10);
        cajaComentario.getChildren().addAll(labelComentario, campoComentario, btn);
        
        
        
        contenedor.setLeft(cajaComentario);
        contenedor.setTop(cajaNombre);
        Scene scene = new Scene(contenedor, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
