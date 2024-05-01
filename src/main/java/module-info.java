module org.imie.fxlogin {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.imie.fxlogin to javafx.fxml;
    exports org.imie.fxlogin;
}