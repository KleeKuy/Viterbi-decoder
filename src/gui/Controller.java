package gui;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

import java.util.Random;

public class Controller {
    @FXML
    Canvas GraphCanvas;
    private GraphicsContext gc ;

    @FXML
    public void generateGraph(MouseEvent mouseEvent) {      //testowe rysowanie
        gc = GraphCanvas.getGraphicsContext2D();
        Random generator = new Random();
        gc.setLineWidth(1);

        for (int i=0; i<6; i++) {
            gc.fillRect(i * 90, 25, 5, 5);
            gc.strokeLine(i * 90, 25, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.strokeLine(i * 90, 25, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.fillRect(i * 90, 125, 5, 5);
            gc.strokeLine(i * 90, 125, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.strokeLine(i * 90, 125, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.fillRect(i * 90, 225, 5, 5);
            gc.strokeLine(i * 90, 225, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.strokeLine(i * 90, 225, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.fillRect(i * 90, 325, 5, 5);
            gc.strokeLine(i * 90, 325, i * 90 + 90, generator.nextInt(4)*100+25);
            gc.strokeLine(i * 90, 325, i * 90 + 90, generator.nextInt(4)*100+25);
        }
    }
}
