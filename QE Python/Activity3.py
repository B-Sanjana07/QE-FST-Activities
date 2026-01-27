def play_game():
    p1 = input("Player 1 (rock/paper/scissors): ").lower()
    p2 = input("Player 2 (rock/paper/scissors): ").lower()

    if p1 == p2:
        print("It's a Tie!")
    elif (p1 == "rock" and p2 == "scissors") or \
         (p1 == "scissors" and p2 == "paper") or \
         (p1 == "paper" and p2 == "rock"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")

while True:
    play_game()

    choice = input("Do you want to play another round? (yes/no): ").lower()
    if choice != "yes":
        print("Game Over")
        break

