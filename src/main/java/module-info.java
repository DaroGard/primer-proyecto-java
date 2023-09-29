module hn.edu.unah.proyectow {
    requires javafx.controls;
    requires javafx.fxml;


    opens hn.edu.unah.proyectow to javafx.fxml;
    exports hn.edu.unah.proyectow;
}