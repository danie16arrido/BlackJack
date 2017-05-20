# Homework

This weekend's homework is to build the card game you planned on Wednesday.

You're going to try and build some variations of Blackjack.

## MVP
- Write a card game where cards are dealt to two players.
- The cards should be compared based on value, and the person with the highest value card wins.
- You don't *need* a `Runner` class - if you have a good suite of unit tests, but you might find it helpful to have one.

## Advice
- It might be a good idea to make it possible to construct a `Deck` (and other classes) with fewer than 52 cards. This will really help with testing.
- Mocking *could* be helpful, but don't spend all your time trying to work with Mockito. It can be a massive pain.
- Just because you know about design patterns now doesn't mean that everything has to make use of them. If you see a good place to use a pattern, go for it, otherwise, just write code as you would normally.

## Extension (Harder)
- Deal two cards to each player.
- Implement full Blackjack comparison rules and choose the winner based on these.
- Watch out for Aces! There are special rules about how these should be scored.

## Extension (DANGER: Really Hard)
- Allow the player to "twist" or "stick".
- Allow the dealer/other player to do the same.
- Compare hands once both players have stuck.
- If you get to this point, have a nice long rest. Then, if you really want to keep coding, trying implementing doubling down or something. Though, to be honest, I don't even know what doubling down is. I just know it's a Blackjack thing.
