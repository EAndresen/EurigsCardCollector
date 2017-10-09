package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

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
        int gridIndex = 0;

        for (Object card : cards){
            Card myCard = (Card) card;
            String cardString = myCard.getCost() + " " + myCard.getName() + "\n" + myCard.getSubtype() + "\n" + myCard.getArtist() + "\n\n";
            Label label = new Label(cardString);
            gridPane.add(label, 0, gridIndex);

            String imageString = "./cards/" + myCard.getUuid() + ".png";

            Image image = new Image(Main.class.getResourceAsStream(imageString), 140,200,false,false);
            ImageView imageView = new ImageView();
            imageView.setImage(image);
            HBox pictureRegion = new HBox();
            pictureRegion.getChildren().add(imageView);
            gridPane.add(pictureRegion, 1, gridIndex);

            gridIndex++;
        }
    }
}
