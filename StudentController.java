// lab12
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class StudentController {
    private final StudentView view;

    public StudentController(StudentView view) {
        this.view = view;
        initController();
    }

    private void initController() {
        view.getAddButton().setOnAction(e -> addStudent());
        view.getClearButton().setOnAction(e -> clearFields());
    }

    private void addStudent() {
        try {
            String name = view.getNameField().getText().trim();
            String id = view.getIdField().getText().trim();
            String course = view.getCourseField().getText().trim();
            double gpa = Double.parseDouble(view.getGpaField().getText().trim());

            if (name.isEmpty() || id.isEmpty() || course.isEmpty()) {
                showAlert("Error", "Please fill all fields.", AlertType.ERROR);
                return;
            }

            Student student = new Student(name, id, course, gpa);
            view.getStudentList().add(student);
            clearFields();
            showAlert("Success", "Student added successfully!", AlertType.INFORMATION);
        } catch (NumberFormatException ex) {
            showAlert("Invalid Input", "Please enter a valid GPA.", AlertType.ERROR);
        }
    }

    private void clearFields() {
        view.getNameField().clear();
        view.getIdField().clear();
        view.getCourseField().clear();
        view.getGpaField().clear();
    }

    private void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
