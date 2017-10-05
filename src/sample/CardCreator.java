package sample;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;

class CardCreator {
    private Gson gson = new Gson();

    Collection<Card> createCards(String inputJson) {
        Type collectionType = new TypeToken<Collection<Card>>(){}.getType();
        return gson.fromJson(inputJson, collectionType);
    }
}
