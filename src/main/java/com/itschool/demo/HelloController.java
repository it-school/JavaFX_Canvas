package com.itschool.demo;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.ArcType;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    Canvas canvas;

    @FXML
    protected void onHelloButtonClick() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
//        root.getChildren().add(canvas);
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(10, 10, 100, 50);
        gc.fillOval(140, 10, 40, 40);
        gc.strokeOval(200, 10, 30, 40);
        gc.fillRoundRect(250, 10, 40, 40, 10, 10);
        gc.strokeRoundRect(310, 10, 40, 40, 5, 5);
        gc.strokeRoundRect(360, 10, 40, 40, 50, 50);

        gc.setFill(new RadialGradient(0, 0, 0.5, 0.5, 0.1, true,
                CycleMethod.REFLECT,new Stop(0.0, Color.CHOCOLATE), new Stop(1.0, Color.BROWN)));
        gc.fillArc(10, 110, 40, 40, 45, 240, ArcType.OPEN);
        gc.fillArc(80, 110, 40, 40, 45, 240, ArcType.CHORD);
        gc.fillArc(150, 110, 40, 40, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 170, 40, 40, 45, 240, ArcType.OPEN);
        gc.strokeArc(80, 170, 40, 40, 45, 240, ArcType.CHORD);
        gc.strokeArc(150, 170, 40, 40, 45, 240, ArcType.ROUND);

        gc.setFill(Color.AQUA);
        gc.setStroke(Color.rgb(18, 180, 250));
        gc.setLineWidth(3);
        gc.fillPolygon(new double[]{10, 40, 10, 40}, new double[]{250, 300, 290, 340}, 4);
        gc.strokePolygon(new double[]{80, 110, 80, 110}, new double[]{250, 300, 290, 340}, 4);
        gc.setStroke(Color.rgb(120, 250, 50));
        gc.strokePolyline(new double[]{170, 150, 170, 150}, new double[]{250, 300, 290, 340}, 4);

        gc.setStroke(Color.rgb(20, 20, 150));
        gc.strokeLine(70,400, 90,450);
        gc.strokeLine(90,450, 110,400);
        gc.strokeLine(110,400, 130,450);
        gc.strokeLine(130,450, 150,400);
    }
}