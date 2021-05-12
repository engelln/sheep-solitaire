# sheep-solitaire
A Java command line implementation of the solitaire card game "Shephy".

# Introduction
This project was created in Spring 2018 to practice OOP inheritance.

[Here is a video of a playthrough of the physical card game (not by me).](https://www.youtube.com/watch?v=3UZNdNApnqE)

Here is a link to a video demonstrating this software in action (by me). (Coming soon!)

# Game Overview
Here is a condensed text version of the above two videos.

The goal of this card game is to be a successful sheep farmer. 

In this game, there are 2 types of cards:
1. Sheep cards: These represent how many sheep you currently own. The values of each sheep card can be 1, 3, 10, 30, 100, 300, or 1000.
2. Event cards: These perform a certain event, either good or bad, every time one is played. The names and descriptions of these cards can be found in "CardNames.java" and "CardDescriptions.java" of the "game" package, respectively. Likewise, when playing the game with this software, the player can type "description {cardname}" to get a card's description. All event card actions are implemented within their respective classes in the "eventcards" package.

In this game, there are 4 types of card decks/hands:
1. Event Card Deck: This deck houses all remaining event cards which have not been played.
2. Player Hand: This deck houses all event cards the player currently has. The player can have up to 5 event cards at once. When a player has less than 5 event cards, they draw more from the event card deck until they have 5, unless it is empty.
3. Discard Deck: This deck houses event cards which the player has played. It exists as some event cards allow the player to play a card from the discard deck.
4. Sheep Field: This deck houses the current sheep cards the player owns. A player can have up to 7 sheep cards at once. 

All of these decks are implemented in their respective class in the "game" pacakage. 

The game then consists of 3 rounds. Each round lasts until the event card deck is empty. At the end of a round, all cards from the discard deck are moved back to the event card deck and get shuffled. At the end of the third round, if the player had 1000 or more sheep, they win. If not, they lose. If at any point the player loses all sheep, they lose.



# Installation
The easiest way to install this software is to clone this repository locally and import the project to the Java IDE of your choice. 

The game can be ran by choosing the "SheepGameTester" class inside the "game" package as the main class.
