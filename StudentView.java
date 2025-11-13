// lab12
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentView {
    private TextField nameField, idField, courseField, gpaField;
    private Button addButton, clearButton;
    private TableView<Student> table;
    private ObservableList<Student> studentList;
    private VBox layout;

    public StudentView() {
        Label nameLabel = new Label("Name:");
        nameField = new TextField();

        Label idLabel = new Label("ID:");
        idField = new TextField();

        Label courseLabel = new Label("Course:");
        courseField = new TextField();

        Label gpaLabel = new Label("GPA:");
        gpaField = new TextField();

        addButton = new Button("Add Student");
        clearButton = new Button("Clear Fields");

        HBox form = new HBox(10, nameLabel, nameField, idLabel, idField, courseLabel, courseField, gpaLabel, gpaField);
        form.setPadding(new Insets(10));

        // Table setup
        table = new TableView<>();
        studentList = FXCollections.observableArrayList();

        TableColumn<Student, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Student, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Student, String> courseCol = new TableColumn<>("Course");
        courseCol.setCellValueFactory(new PropertyValueFactory<>("course"));

        TableColumn<Student, Double> gpaCol = new TableColumn<>("GPA");
        gpaCol.setCellValueFactory(new PropertyValueFactory<>("gpa"));

        table.getColumns().addAll(nameCol, idCol, courseCol, gpaCol);
        table.setItems(studentList);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        HBox buttons = new HBox(10, addButton, clearButton);
        buttons.setPadding(new Insets(10));

        layout = new VBox(10, form, buttons, table);
        layout.setPadding(new Insets(10));
    }

    public VBox getMainLayout() { return layout; }

    public TextField getNameField() { return nameField; }
    public TextField getIdField() { return idField; }
    public TextField getCourseField() { return courseField; }
    public TextField getGpaField() { return gpaField; }
    public Button getAddButton() { return addButton; }
    public Button getClearButton() { return clearButton; }
    public ObservableList<Student> getStudentList() { return studentList; }
}
