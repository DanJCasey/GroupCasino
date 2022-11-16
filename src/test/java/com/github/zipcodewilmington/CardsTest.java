package com.github.zipcodewilmington;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CardsTest {

    @Test
    public void deckOfCardsTest() {
        Deck deck = new Deck();
        System.out.println(List.of(deck.dealCard(52)));
    }
    @Test
    public void shuffleTest() {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(List.of(deck.dealCard(52)));
    }
    @Test
    public void FaceDownTest() {
        Deck deck = new Deck();
        String expected = "Face of Down";
        String actual = String.valueOf(deck.faceDown);
        assertEquals(expected, actual);
    }
    @Test
    public void dealCardFaceDownTest() {
        Deck deck = new Deck();
        deck.dealCardFaceDown(1);
        String expected = String.valueOf(deck.temp[0]);
        String actual = "ACE of HEARTS";
        assertEquals(expected, actual);
    }
    @Test
    public void flipTest() {
        Deck deck = new Deck();
        deck.dealCardFaceDown(1);
        String expected = "ACE of HEARTS";
        String actual = String.valueOf(deck.reveal(0,true));
        assertEquals(expected,actual);
    }
}