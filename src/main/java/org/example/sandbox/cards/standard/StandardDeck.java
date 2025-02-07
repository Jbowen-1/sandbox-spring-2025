package org.example.sandbox.cards.standard;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements Deck {

    private List<Card> cards;

    public StandardDeck(); {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue rank : FaceValue.values()) {
                newDeck.add(new Card(suit, rank));
            }
        }
        // add jokers
        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    @Override
    public void cut(int index) {

        List<Card> top = this.cards.subList(0, index);
        List<Card> bottom = this.cards.subList(index, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public Card turnover() {
        return cards.get(0);
    }

    @Override
    public int search(Card card) {
        return cards.indexOf(card);
    }

    @Override
    public void newOrder(Deck cards) {
        // FIXME: This is a bug. The method should be sorting the cards in the deck passed in, not the deck that the method is called on.
        //Collections.sort(cards);

    }

    @Override
    public Card draw() {
        return null;
    }

    @Override
    public int size() {
        return this.cards.size();
    }

    @Override
    public int newSize() throws OperationNotSupportedException {
        return Deck.super.newSize();
    }
}