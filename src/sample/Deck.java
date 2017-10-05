package sample;

import java.util.Collection;

public class Deck {
    private String campaignDeck;
    private String tournamentDeck;
    private String name;
    private String champion;
//    private Collection<Equipment> equipment;
    private Collection<Card> deck;
    private Collection<Card> sideboard;

    public String getCampaignDeck() {
        return campaignDeck;
    }

    public void setCampaignDeck(String campaignDeck) {
        this.campaignDeck = campaignDeck;
    }

    public String getTournamentDeck() {
        return tournamentDeck;
    }

    public void setTournamentDeck(String tournamentDeck) {
        this.tournamentDeck = tournamentDeck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public Collection<Card> getDeck() {
        return deck;
    }

    public void setDeck(Collection<Card> deck) {
        this.deck = deck;
    }

    public Collection<Card> getSideboard() {
        return sideboard;
    }

    public void setSideboard(Collection<Card> sideboard) {
        this.sideboard = sideboard;
    }
}
