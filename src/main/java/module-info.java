module com.example.firstdesktopappjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstdesktopappjavafx to javafx.fxml;
    exports com.example.firstdesktopappjavafx;
}