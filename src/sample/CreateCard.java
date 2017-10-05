package sample;

import com.google.gson.Gson;

class CreateCard {

    Card createCard(String jsonInputString) {
        Gson gson = new Gson();

        return gson.fromJson(jsonInputString, Card.class);
    }
}
