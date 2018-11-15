import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMenus extends Application /* implements EventHandler<ActionEvent> */ {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FX Menus");

        BorderPane layout = new BorderPane();

        //File menu
        Menu fileMenu = new Menu("_File");
        MenuItem newFile = new MenuItem("_New...");
        newFile.setOnAction(event -> System.out.println("Create a new file..."));
        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(new MenuItem("_Open..."));
        fileMenu.getItems().add(new MenuItem("_Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Se_ttings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem exitMenu = new MenuItem("E_xit");
        KeyCombination kcExit = new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN);
        exitMenu.setAccelerator(kcExit);
        exitMenu.acceleratorProperty();
        exitMenu.setOnAction(event -> System.exit(0));
        fileMenu.getItems().add(exitMenu);

        //Edit menu
        Menu editMenu = new Menu("_Edit");
        MenuItem cutMItem = new MenuItem("Cut");
        //cutMItem.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
        cutMItem.setAccelerator(KeyCodeCombination.keyCombination("Ctrl+X")); //alternative
        cutMItem.setOnAction(event -> {
            System.out.println("Cut menu selected");
        });
        editMenu.getItems().add(cutMItem);
        editMenu.getItems().add(new MenuItem("Copy"));
        editMenu.getItems().add(new MenuItem("Paste"));

        //Difficulty RadioMenuItems
        Menu difficultyMenu = new Menu("_Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();
        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");
        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);
        difficultyToggle.selectToggle(easy);
        difficultyMenu.getItems().addAll(easy, medium, hard);

        //Help menu
        Menu helpMenu = new Menu("_Help");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setSelected(true);
        showLines.setOnAction(e -> {
            if (showLines.isSelected())
                System.out.println("Showing lines");
            else
                System.out.println("Hiding lines");
        });
        helpMenu.getItems().add(showLines);

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, difficultyMenu, helpMenu);
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}