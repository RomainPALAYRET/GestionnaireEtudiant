module com.example.gestionnaireetudiant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionnaireetudiant to javafx.fxml;
    exports com.example.gestionnaireetudiant;
}