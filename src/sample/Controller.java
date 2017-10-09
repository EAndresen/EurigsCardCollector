package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab startTab;

    @FXML
    private TextArea consoleTextArea;

    @FXML
    private ScrollPane startScrollPane;

    @FXML
    private void initialize() throws FileNotFoundException {
        CardCreator cardCreator = new CardCreator();
        DisplayCards displayCards = new DisplayCards();
        displayCards.drawCards(startTab, startScrollPane);

        try {
            HEXClientAPIListener hexClientAPIListener = new HEXClientAPIListener(consoleTextArea);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
