# tower of hanoi function that takes three arguments:
# number of disks, start peg, end peg
# and a fourth argument - an optional flag:
# if the flag is 1, print each move as it's made

def tower_of_hanoi(number_of_disks, start_peg, end_peg, flag=0):
    # if number of disks is 1, just move it
    if number_of_disks == 1:
        print("Move disk 1 from peg", start_peg, "to peg", end_peg)
        return
    # if number of disks is 2, move it and move the other disk
    if number_of_disks == 2:
        print("Move disk 1 from peg", start_peg, "to peg", end_peg)
        print("Move disk 2 from peg", start_peg, "to peg", end_peg)
        print("Move disk 1 from peg", end_peg, "to peg", start_peg)
        print("Move disk 2 from peg", end_peg, "to peg", start_peg)
        return
    # if number of disks is 3, move it and move the other disk
    if number_of_disks == 3:
        print("Move disk 1 from peg", start_peg, "to peg", end_peg)
        print("Move disk 2 from peg", start_peg, "to peg", end_peg)
        print("Move disk 3 from peg", start_peg, "to peg", end_peg)
        print("Move disk 1 from peg", end_peg, "to peg", start_peg)
        print("Move disk 2 from peg", end_peg, "to peg", start_peg)
        print("Move disk 3 from peg", end_peg, "to peg", start_peg)
        return
    # if number of disks is 4, move it and move the other disk
    if number_of_disks == 4:
        print("Move disk 1 from peg", start_peg, "to peg", end_peg)
        print("Move disk 2 from peg", start_peg, "to peg", end_peg)
        print("Move disk 3 from peg", start_peg, "to peg", end_peg)
        print("Move disk 4 from peg", start_peg, "to peg", end_peg)
        print("Move disk 1 from peg", end_peg, "to peg", start_peg)
        print("Move disk 2 from peg", end_peg, "to peg", start_peg)
        print("Move disk 3 from peg", end_peg, "to peg", start_peg)
        print("Move disk 4 from peg", end_peg, "to peg", start_peg)
        return
    # if number of disks is 5, move it and move the other disk
    if number_of_disks == 5:
        print("Move disk 1 from peg", start_peg, "to peg", end_peg)
        print("Move disk 2 from peg", start_peg, "to peg", end_peg)
        print("Move disk 3 from peg", start_peg, "to peg", end_peg)
        print("Move disk 4 from peg", start_peg, "to peg", end_peg)
        print("Move disk 5 from peg", start_peg, "to peg", end_peg)
        print("Move disk 1 from peg", end_peg, "to peg", start_peg)
        print("Move disk 2 from peg", end_peg, "to peg", start_peg)
        print("Move disk 3 from peg", end_peg, "to peg", start_peg)
        print("Move disk 4 from peg", end_peg, "to peg", start_peg)
        print("Move disk 5 from peg", end_peg, "to peg", start_peg)
        return

    #print the outcome of the tower of  hanoi operation
    #if flag is 1, print each move as it's made
    # if flag is 0, print the final outcome
    # if flag is 2, print the final outcome and the moves
   
    if flag == 1:
        print("Move disk", number_of_disks, "from peg", start_peg, "to peg", end_peg)
    if flag == 2:
        print("Move disk", number_of_disks, "from peg", start_peg, "to peg", end_peg)
    if flag == 0:
        print("Move disk", number_of_disks, "from peg", start_peg, "to peg", end_peg)
    # call the tower of hanoi function with the number of disks - 1
    # and the start peg and the end peg swapped
    tower_of_hanoi(number_of_disks - 1, start_peg, end_peg, flag)
    # call the tower of hanoi function with the number of disks - 1
    # and the start peg and the end peg swapped


    
