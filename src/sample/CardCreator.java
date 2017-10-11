package sample;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

class CardCreator {
    private Gson gson = new Gson();
    private List<Card> cardCollection;

    private String JSON_PATH = "src\\sample\\HEXData\\cards.json";
    private BufferedReader bufferedReader = new BufferedReader(new FileReader(JSON_PATH));
    private JsonParser jsonParser = new JsonParser();
    JsonArray jsonArray = jsonParser.parse(bufferedReader).getAsJsonArray();


    CardCreator() throws FileNotFoundException {
        Type listType = new TypeToken<List<Card>>(){}.getType();
        this.cardCollection = gson.fromJson(jsonArray, listType);
    }


    Collection<Card> getCardCollection() {
        return cardCollection;
    }

}
