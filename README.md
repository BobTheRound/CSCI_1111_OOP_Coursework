# CSCI_1111_OOP_Coursework
This repository will contain all of my CS 1111 work at Southwest Tech.

#Final Project for OOP1:
#Through The Breach Fate Deck

It's a deck of cards that calculates your odds of drawing the dreaded Black Joker(crit fail!) on every draw!
It also helps build a Twist deck!

##How To Run
Download the file, run through Eclipse!

if (fateDeck[i] == 53) {
				System.out.println("You drew the Black Joker, Critical Failure!\n");
				this.badLuck = false;
				i++;
			}else if(fateDeck[i] == 52) {
				System.out.println("You drew the Red Joker! Critical Success!\n");
				i++;
			}else {
				String suit = suits[fateDeck[i] / 13];
				String cardRank = ranks[fateDeck[i] % 13];


Contributions are always welcome! For later projects please ask permission, else if you can find a reason to use this code use it!
