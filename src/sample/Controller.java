package sample;

import javafx.fxml.FXML;

public class Controller {



    @FXML
    private void initialize(){
        CreateCard createCard = new CreateCard();

        String jsonString1 = "{\n" +
                "\t\t\"name\": \"Zakiir\",\n" +
                "\t\t\"cost\": \"6\",\n" +
                "\t\t\"threshold\": \"3 Ruby\",\n" +
                "\t\t\"uuid\": \"edad6f31-86fe-4417-aef8-537ae54e37a8\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Dragon\",\n" +
                "\t\t\"restriction\": \"Unique\",\n" +
                "\t\t\"rarity\": \"Legendary\",\n" +
                "\t\t\"text\": \"<b>Flight</b><p><p>At the start of your turn, choose one at random: Create a <b>Power of Zakiir: Destructive Delirium</b> and put it into your hand; Create a <b>Power of Zakiir: Glimpse of Insanity</b> and put it into your hand; Create a <b>Power of Zakiir: Eye of Zakiir</b> and put it into your hand; Create a <b>Power of Zakiir: Flame Breath</b> and put it into your hand; or  Create a <b>Power of Zakiir: Fire Servant</b> and put it into your hand.\",\n" +
                "\t\t\"flavor\": \"\\\"We are denizens of the Feralroot, the fey of the First Mortals. We serve the Warden of the Weald, the ruby gem dragon known as Zakiir.\\\" -Myaa\",\n" +
                "\t\t\"atk\": \"5\",\n" +
                "\t\t\"health\": \"5\",\n" +
                "\t\t\"artist\": \"Raymond Swanland\",\n" +
                "\t\t\"set_id\": \"Shattered Destiny\"\n" +
                "\t}";

        String jsonString2 = "{\n" +
                "\t\t\"name\": \"Power of Zakiir: Fire Servant\",\n" +
                "\t\t\"cost\": \"1\",\n" +
                "\t\t\"threshold\": \"1 Ruby\",\n" +
                "\t\t\"uuid\": \"89b96a3f-5aa9-4925-aab6-6fcf39ef3efb\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Spirit Knight\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Non-Collectible\",\n" +
                "\t\t\"text\": \"<b>Speed</b>, <b>Swiftstrike</b><p><p>When this leaves play, it deals 4 damage to target champion or troop.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"4\",\n" +
                "\t\t\"health\": \"1\",\n" +
                "\t\t\"artist\": \"Andreas Zafeiratos\",\n" +
                "\t\t\"set_id\": \"Shattered Destiny\"\n" +
                "\t}";


        String bigJson = "" +
                "{ \"cards\": [\n" +
                "\t{\n" +
                "\t\t\"name\": \"Power of Zakiir: Fire Servant\",\n" +
                "\t\t\"cost\": \"1\",\n" +
                "\t\t\"threshold\": \"1 Ruby\",\n" +
                "\t\t\"uuid\": \"89b96a3f-5aa9-4925-aab6-6fcf39ef3efb\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Spirit Knight\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Non-Collectible\",\n" +
                "\t\t\"text\": \"<b>Speed</b>, <b>Swiftstrike</b><p><p>When this leaves play, it deals 4 damage to target champion or troop.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"4\",\n" +
                "\t\t\"health\": \"1\",\n" +
                "\t\t\"artist\": \"Andreas Zafeiratos\",\n" +
                "\t\t\"set_id\": \"Shattered Destiny\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Zakiir\",\n" +
                "\t\t\"cost\": \"6\",\n" +
                "\t\t\"threshold\": \"3 Ruby\",\n" +
                "\t\t\"uuid\": \"edad6f31-86fe-4417-aef8-537ae54e37a8\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Dragon\",\n" +
                "\t\t\"restriction\": \"Unique\",\n" +
                "\t\t\"rarity\": \"Legendary\",\n" +
                "\t\t\"text\": \"<b>Flight</b><p><p>At the start of your turn, choose one at random: Create a <b>Power of Zakiir: Destructive Delirium</b> and put it into your hand; Create a <b>Power of Zakiir: Glimpse of Insanity</b> and put it into your hand; Create a <b>Power of Zakiir: Eye of Zakiir</b> and put it into your hand; Create a <b>Power of Zakiir: Flame Breath</b> and put it into your hand; or  Create a <b>Power of Zakiir: Fire Servant</b> and put it into your hand.\",\n" +
                "\t\t\"flavor\": \"\\\"We are denizens of the Feralroot, the fey of the First Mortals. We serve the Warden of the Weald, the ruby gem dragon known as Zakiir.\\\" -Myaa\",\n" +
                "\t\t\"atk\": \"5\",\n" +
                "\t\t\"health\": \"5\",\n" +
                "\t\t\"artist\": \"Raymond Swanland\",\n" +
                "\t\t\"set_id\": \"Shattered Destiny\"\n" +
                "\t}\n" +
                "\t]\n" +
                "}";


        Card bigCard = createCard.createCard(bigJson);



//        Card card1 = createCard.createCard(jsonString1);
//        Card card2 = createCard.createCard(jsonString2);
//
//
//        System.out.println(card1.getName());
//        System.out.println(card1.getUuid() + "\n");
//
//        System.out.println(card2.getName());
//        System.out.println(card2.getUuid());

    }
}
