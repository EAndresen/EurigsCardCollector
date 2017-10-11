package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;

public class DisplayCards {
    private CardCreator cardCreator = new CardCreator();
    private Collection<Card> cards = cardCreator.getCardCollection();

    DisplayCards() throws FileNotFoundException {
    }

    void drawCards(Tab startTab, ScrollPane startScrollPane) {
        GridPane gridPane = new GridPane();
        gridPane.getStyleClass().add("cardPane");
        startTab.setContent(startScrollPane);
        startScrollPane.setContent(gridPane);
        int rowIndex = 0;
        int columnIndex = 0;

        for (Object card : cards){
            Card myCard = (Card) card;
            String cardString = myCard.getName();
            TextField textField = new TextField(cardString);
            gridPane.add(textField, columnIndex, rowIndex+1);

            String imageString = "./cards/" + myCard.getUuid() + ".png";

            boolean temp = new File("./src/sample/cards/" + myCard.getUuid() + ".png").isFile();
            if (!temp) {
                imageString = "./cards/Default-Sleeve.jpg";
            }

            Image image = new Image(Main.class.getResourceAsStream(imageString), 140,200,false,false);
            ImageView imageView = new ImageView();
            imageView.setImage(image);
            HBox pictureRegion = new HBox();
            pictureRegion.getChildren().add(imageView);
            gridPane.add(pictureRegion, columnIndex, rowIndex);

            columnIndex++;
            if (columnIndex == 5) {
                rowIndex+=2;
                columnIndex= 0;
            }

        }
    }
}
