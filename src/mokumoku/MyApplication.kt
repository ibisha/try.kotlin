package mokumoku

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class MyApplication : Application() {
    override fun start(primaryStage: Stage) {
        primaryStage.title = "Hello World"
        primaryStage.scene = Scene(FXMLLoader.load<Parent>(this.javaClass.getResource("MyApplication.fxml")), 300.0, 420.0)
        primaryStage.show()
    }


}

