package com.dentista;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** extend Application, add JavaFX components */
public class App extends Application {

    @Override
    public void start(Stage ventana) {
        
        Label texto = new Label("BIENVENIDO A LA CLINICA DENTAL");
        
        Label texto2 = new Label("DENTIST-I.ARTIFICIAL");
        Button boton = new Button("Probar");
        boton.setOnAction(e -> texto2.setText("¡El botón funciona!"));


        Button boton2 = new Button("Salir");
        boton2.setOnAction(e -> texto.setText("¡Hasta luego!"));
        //StackPane raiz = new StackPane(texto, texto2);//un contenedor que centra lo que le pongas.
        VBox raiz = new VBox(20, texto, texto2, boton, boton2);
        raiz.setAlignment(Pos.CENTER);

        texto.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        texto2.setStyle("-fx-font-size: 18px; -fx-font-style: italic;");
        Scene escena = new Scene(raiz, 600,600);
        ventana.setScene(escena); //pone el contenido en la ventana
        // -----
        ventana.setTitle("DENTIST-I.ARTIFICIAL");
        ventana.show();
    }
    public static void main(String[] args) {
        launch(args);
        System.out.println("Hola mi amor");
        int a = 5;
        System.out.println(a);
    }
}
