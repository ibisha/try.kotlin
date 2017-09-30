package mokumoku

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

/**
 * sample.fxmlで定義された部品に関するクラス(コントローラ)
 */
class MyController {
    //フィールドやメソッドの先頭に@FXMLアノテーションを付けることで、sample.fxmlとリンクする

    //lateinit(遅延初期化オプション)を付けることで、nullチェックを避ける
    @FXML lateinit var label1: Label
    @FXML lateinit var field1: TextField
    @FXML lateinit var btn1: Button

    @FXML
    fun btn1OnAction() {
        this.label1.text = "あなたは、「${this.field1.text}」と書いた。"
    }
}