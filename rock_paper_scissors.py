# Simulation of rock, paper, scissors game. Human against computer.
import random

def play():
    def winner(human, computer):
        """
        Determines the winner.
        """
        if human == computer:
            return "It's a tie!"
        elif human == 'rock':
            if computer == 'paper':
                return "You lose!"
            else:
                return "You win!"
        elif human == 'paper':
            if computer == 'scissors':
                return "You lose!"
            else:
                return "You win!"
        elif human == 'scissors':
            if computer == 'rock':
                return "You lose!"
            else:
                return "You win!"
    """
    Plays the game of rock, paper, scissors.
    """
    print("Let's play rock, paper, scissors!")
    print("(Enter 'q' to quit.)")
    while True:
        human = get_human_move()
        if human == 'q':
            break
        computer = get_computer_move()
        print("You chose:", human)
        print("Computer chose:", computer)
        print(winner(human, computer))

def get_human_move():
    """
    Gets the human move.
    """
    while True:
        human = input("Rock, paper, or scissors? ")
        if human == 'q':
            return human
        human = human.lower()
        if human in ['rock', 'paper', 'scissors']:
            return human
        print("Invalid choice.")

def get_computer_move():
    """
    Gets the computer move.
    """
    return random.choice(['rock', 'paper', 'scissors'])

