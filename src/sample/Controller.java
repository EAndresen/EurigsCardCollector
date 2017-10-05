package sample;

import javafx.fxml.FXML;

import java.util.Collection;

public class Controller {



    @FXML
    private void initialize(){
        CardCreator cardCreator = new CardCreator();

        String jsonString = "{\n" +
                "\t\t\"name\": \"Lady Valerie\",\n" +
                "\t\t\"cost\": \"4\",\n" +
                "\t\t\"threshold\": \"2 Wild\",\n" +
                "\t\t\"uuid\": \"5008c500-219b-4382-87cb-e6e3d8c153aa\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Faerie\",\n" +
                "\t\t\"restriction\": \"Unique\",\n" +
                "\t\t\"rarity\": \"Epic\",\n" +
                "\t\t\"text\": \"<b>Flight</b><p><p><b>Deploy</b> - Summon two <b>Battle Faeries</b>.\",\n" +
                "\t\t\"flavor\": \"Born to fey royalty, Lady Valerie's kindness is only exceeded by her ferocity when protecting the ones she loves.\",\n" +
                "\t\t\"atk\": \"2\",\n" +
                "\t\t\"health\": \"4\",\n" +
                "\t\t\"artist\": \"Robb Mommaerts\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Battle Faerie\",\n" +
                "\t\t\"cost\": \"1\",\n" +
                "\t\t\"threshold\": \"1 Wild\",\n" +
                "\t\t\"uuid\": \"fd5e7a1d-4a61-419a-b9b2-3d38c564e50c\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Faerie\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Non-Collectible\",\n" +
                "\t\t\"text\": \"<b>Flight</b>, <b>Defensive</b>\",\n" +
                "\t\t\"flavor\": \"Small in stature, but possessed of enormous savagery.\",\n" +
                "\t\t\"atk\": \"2\",\n" +
                "\t\t\"health\": \"1\",\n" +
                "\t\t\"artist\": \"Robb Mommaerts\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Killarvae\",\n" +
                "\t\t\"cost\": \"2\",\n" +
                "\t\t\"threshold\": \"1 Blood\",\n" +
                "\t\t\"uuid\": \"c5de53fb-854e-4bb5-a922-45d354130974\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Insect\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Rare\",\n" +
                "\t\t\"text\": \"<b>Lethal</b><p><p>When this deals damage to a champion, that champion becomes <b>Toxified</b>.<p><p>When this deals damage to a <b>Toxified</b> champion, that champion discards a card at random.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"2\",\n" +
                "\t\t\"health\": \"1\",\n" +
                "\t\t\"artist\": \"Wei Zi\",\n" +
                "\t\t\"set_id\": \"AZ2\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Lost Gnome\",\n" +
                "\t\t\"cost\": \"2\",\n" +
                "\t\t\"threshold\": \"\",\n" +
                "\t\t\"uuid\": \"4ccb7e5f-bc32-4e9a-b1fe-abf944b27b74\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Gnome\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Epic\",\n" +
                "\t\t\"text\": \"<b>Unlimited</b><p><p>When an opposing Wormoid enters play, put this into your deck and draw a card.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"1\",\n" +
                "\t\t\"health\": \"2\",\n" +
                "\t\t\"artist\": \"Kieran Yanner\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Wormoid Grub\",\n" +
                "\t\t\"cost\": \"6\",\n" +
                "\t\t\"threshold\": \"2 Ruby\",\n" +
                "\t\t\"uuid\": \"71eb42ef-ea8a-45a9-85a1-a418041bcf00\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Wormoid\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Epic\",\n" +
                "\t\t\"text\": \"[BASIC] [RUBY]: [(2)] [ARROWR] <b>Tunneling 4</b>.<p><p>When an opposing champion plays a troop, if this is underground, this gets <b>Tunneling -1</b>.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"4\",\n" +
                "\t\t\"health\": \"3\",\n" +
                "\t\t\"artist\": \"Yuriy Chemezov\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Wormoid\",\n" +
                "\t\t\"cost\": \"8\",\n" +
                "\t\t\"threshold\": \"2 Ruby\",\n" +
                "\t\t\"uuid\": \"29d3dba9-4978-4bae-b228-31704a8093c3\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Wormoid\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Epic\",\n" +
                "\t\t\"text\": \"<b>Crush</b><p><p>[BASIC] [RUBY]: [(2)] [ARROWR] <b>Tunneling 6</b>.<p><p>When an opposing champion plays an action, if this is underground, this gets <b>Tunneling -2</b>.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"5\",\n" +
                "\t\t\"health\": \"5\",\n" +
                "\t\t\"artist\": \"John Silva\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Firebreathing Wormoid\",\n" +
                "\t\t\"cost\": \"10\",\n" +
                "\t\t\"threshold\": \"2 Ruby\",\n" +
                "\t\t\"uuid\": \"b76be4c0-a340-4bec-9c09-2b17df50f54f\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Wormoid\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Epic\",\n" +
                "\t\t\"text\": \"[BASIC] [RUBY]: [(2)] [ARROWR] <b>Tunneling 8</b>.<p><p>When an opposing champion plays a resource, if this is underground, this gets <b>Tunneling -1</b>.<p><p><b>Deploy</b> - This deals 1 damage to each opposing troop for each Wormoid you control.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"9\",\n" +
                "\t\t\"health\": \"4\",\n" +
                "\t\t\"artist\": \"MagicMan\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Princess Daphne\",\n" +
                "\t\t\"cost\": \"1\",\n" +
                "\t\t\"threshold\": \"1 Diamond\",\n" +
                "\t\t\"uuid\": \"686ab5d7-3635-4cb2-91b5-2f933ccc7cb2\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Human Princess\",\n" +
                "\t\t\"restriction\": \"Unique\",\n" +
                "\t\t\"rarity\": \"Promo\",\n" +
                "\t\t\"text\": \"This can't attack.<p><p>This can't block.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"0\",\n" +
                "\t\t\"health\": \"1\",\n" +
                "\t\t\"artist\": \"Michael Berube\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Strangling Darkness\",\n" +
                "\t\t\"cost\": \"1\",\n" +
                "\t\t\"threshold\": \"1 Blood\",\n" +
                "\t\t\"uuid\": \"b9802488-9cd7-495c-b0fd-9ce300d91c35\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Spirit\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Epic\",\n" +
                "\t\t\"text\": \"<b>Flight</b><p><p><b>Deploy</b> - Each opposing champion discards a non-resource card with cost [(2)] or less.\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"1\",\n" +
                "\t\t\"health\": \"1\",\n" +
                "\t\t\"artist\": \"Anders Finer\",\n" +
                "\t\t\"set_id\": \"AI Only Cards\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"Chupacabra\",\n" +
                "\t\t\"cost\": \"4\",\n" +
                "\t\t\"threshold\": \"1 Blood\",\n" +
                "\t\t\"uuid\": \"fb19f8ae-bf96-4d10-8e4b-eeb40837358e\",\n" +
                "\t\t\"type\": \"Troop\",\n" +
                "\t\t\"subtype\": \"Beast\",\n" +
                "\t\t\"restriction\": \"\",\n" +
                "\t\t\"rarity\": \"Uncommon\",\n" +
                "\t\t\"text\": \"<b>Speed</b><p><p>When this attacks, a random opposing troop gets -1[ATK]/-1[DEF]. Then, this gets +1[ATK]/+1[DEF].\",\n" +
                "\t\t\"flavor\": \"\",\n" +
                "\t\t\"atk\": \"1\",\n" +
                "\t\t\"health\": \"2\",\n" +
                "\t\t\"artist\": \"Apterus\",\n" +
                "\t\t\"set_id\": \"AZ2\"\n" +
                "\t}";

        String jsonOutput = "[" +  jsonString + "]";

        Collection cards = cardCreator.createCards(jsonOutput);
        for (Object card : cards){
            Card myCard = (Card) card;
            System.out.println(myCard .getName());
        }

    }
}
