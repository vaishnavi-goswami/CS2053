import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab12 extends Application {

    @Override
    public void start(Stage primaryStage) {
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);

        Scene scene = new Scene(view.getMainLayout(), 600, 400);
        primaryStage.setTitle("Lab Session 12: Student Record System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// other files - Student.java, StudentController.java, StudentView.java
