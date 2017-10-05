package sample;

import com.google.gson.Gson;

public class CreateCard {

    public Card createCard(String jsonInputString) {
        Gson gson = new Gson();
        Card card = gson.fromJson(jsonInputString, Card.class);

        return card;
    }
}
