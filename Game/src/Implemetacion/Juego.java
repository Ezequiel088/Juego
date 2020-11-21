package Implemetacion;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Juego extends Application{
	private GraphicsContext graficos;
	private Group root;
	private Scene escena;
	private Canvas lienzo;

public static void main(String[] args) {
	launch(args);
}

	@Override
	public void start(Stage ventana) throws Exception {
		    iniciarComponentes();
		    pintar();
			ventana.setScene(escena);
			ventana.setTitle("Guardians of the Seal");
			ventana.show();
			
		}
	
	public void iniciarComponentes() {
		root = new Group();
		escena = new Scene(root, 700, 500);
		lienzo = new Canvas(700, 500);
		root.getChildren().add(lienzo);
		graficos = lienzo.getGraphicsContext2D();
	}
	
	public void pintar() {
		graficos.fillRect(0,0,100,100);
		graficos.drawImage (new Image("Attack (1).png"),0 ,0 );
	}
}
