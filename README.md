# Hangman Game in Java

A simple console-based Hangman game developed in Java. The game randomly selects a word from a predefined word pool, and the player attempts to guess the word one letter at a time before running out of chances.

## Features

- Random word selection using Java's Random library
- Predefined word pool for gameplay
- Character-by-character guessing
- String matching to reveal correct letters
- Win and lose conditions
- Interactive console-based gameplay

## Technologies Used

- Java
- Random Class
- String Manipulation
- Arrays / Collections (if used)
- Scanner Class for user input

## How It Works

1. The program stores a collection of words in a word pool.
2. A random word is selected using the Random class.
3. The player enters letter guesses.
4. The program checks whether the guessed character exists in the selected word.
5. Correct guesses reveal matching letters.
6. Incorrect guesses reduce the remaining attempts.
7. The game continues until:
   - The player correctly guesses the entire word, or
   - The player runs out of attempts.

## Project Structure

```
HangmanGame/
│
├── Hangman.java
├── README.md
```

## Sample Gameplay

```
Welcome to Hangman!

Word: _ _ _ _ _

Enter a letter: a

Word: _ a _ _ _

Enter a letter: e

Wrong guess!
Attempts left: 5

Enter a letter: r

Word: _ a r _ _

...
```

## Learning Outcomes

This project helped in understanding:

- Java fundamentals
- String handling and manipulation
- Random number generation
- Conditional statements and loops
- User input handling
- Basic game development logic

## Future Enhancements

- Multiple difficulty levels
- Categories for words
- Hint system
- Score tracking
- GUI using Java Swing or JavaFX
- File-based word storage

## Author

Kush

---
A beginner-friendly Java project demonstrating core programming concepts through an interactive Hangman game.