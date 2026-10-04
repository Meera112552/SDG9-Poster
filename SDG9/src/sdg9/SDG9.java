/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdg9;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Meera
 */
public class SDG9 extends Application {
    @Override
    public void start(Stage stage) {

        // Main layout
        VBox root = new VBox(15);
        root.setAlignment(Pos.TOP_CENTER);
        root.setStyle("-fx-background-color: #F4F8FB;");

        // Header
        Label title = new Label("SDG 9");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 42));
        title.setTextFill(Color.WHITE);

        Label subtitle = new Label(
                "INDUSTRY, INNOVATION AND INFRASTRUCTURE");
        subtitle.setFont(Font.font("Arial", FontWeight.BOLD, 22));
        subtitle.setTextFill(Color.WHITE);

        VBox header = new VBox(5, title, subtitle);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new javafx.geometry.Insets(18));
        header.setMaxWidth(Double.MAX_VALUE);
        header.setStyle("-fx-background-color: #D62828;");

        // Main message
        Label message = new Label("BUILD • INNOVATE • CONNECT");
        message.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        message.setTextFill(Color.DARKSLATEGRAY);

        // Buildings
        Rectangle building1 = new Rectangle(100, 140, Color.STEELBLUE);
        Rectangle building2 = new Rectangle(120, 190, Color.DARKSLATEGRAY);
        Rectangle building3 = new Rectangle(100, 160, Color.ROYALBLUE);

        HBox buildings = new HBox(15, building1, building2, building3);
        buildings.setAlignment(Pos.BOTTOM_CENTER);

        // Innovation symbol
        Circle bulb = new Circle(50, Color.GOLD);

        Label bulbText = new Label("IDEA");
        bulbText.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        bulbText.setTextFill(Color.DARKSLATEGRAY);

        StackPane innovation = new StackPane(bulb, bulbText);

        // Information cards
        Label industry = new Label(
                "🏭  INDUSTRY\n\nStrong and sustainable industries\ncreate jobs and economic growth.");

        Label innovation = new Label(
                "💡  INNOVATION\n\nNew ideas and technology\nhelp solve future problems.");

        Label infrastructure = new Label(
                "🌉  INFRASTRUCTURE\n\nReliable roads, transport and\ndigital networks connect people.");

        industry.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        innovation.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        infrastructure.setFont(Font.font("Arial", FontWeight.BOLD, 15));

        industry.setPadding(new javafx.geometry.Insets(15));
        innovation.setPadding(new javafx.geometry.Insets(15));
        infrastructure.setPadding(new javafx.geometry.Insets(15));

        industry.setStyle("-fx-background-color: white; "
                + "-fx-border-color: #D62828; -fx-border-width: 2;");

        innovation.setStyle("-fx-background-color: white; "
                + "-fx-border-color: #D62828; -fx-border-width: 2;");

        infrastructure.setStyle("-fx-background-color: white; "
                + "-fx-border-color: #D62828; -fx-border-width: 2;");

        HBox cards = new HBox(15, industry, innovation, infrastructure);
        cards.setAlignment(Pos.CENTER);

        // Footer
        Label footer = new Label(
                "SUSTAINABLE TECHNOLOGY FOR A BETTER FUTURE");
        footer.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        footer.setTextFill(Color.WHITE);
        footer.setPadding(new javafx.geometry.Insets(12));
        footer.setStyle("-fx-background-color: #D62828;");

        root.getChildren().addAll(
                header,
                message,
                buildings,
                innovation,
                cards,
                footer
        );

        Scene scene = new Scene(root, 850, 750);

        stage.setTitle("SDG 9 Poster");
        stage.setScene(scene);
        stage.show();
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        // TODO code application logic here
    }
    
}
