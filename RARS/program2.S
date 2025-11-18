# ====================================================
# Average of absolute values
# 
# This program reads in a list of N numbers and prints the 
# average of the absolute value of those N numbers.
#
# Author: Christian Duncan
# ====================================================
# Some assembler constants for easier reading
    .eqv ePrintInt, 1
    .eqv ePrintFloat, 2
    .eqv ePrintDouble, 3
    .eqv ePrintString, 4
    .eqv eReadInt, 5
    .eqv eReadFloat, 6
    .eqv eReadDouble, 7
    .eqv eReadString, 8

    .data
prompt1: .asciz "How many numbers will there be?\n"
prompt2: .asciz "Please enter the "
prompt3: .asciz " numbers.\n"

N: .word 0       # The number of items
sum: .double 0.0 # Sum of all the numbers

    .text
    .globl main
    .globl end
    .globl print_newline

main:
    # How many numbers will there be?

    # Print out "Please enter the N numbers"

    # Now read in the N values

    # Compute and print the average

    # End program
    j end

# An example of a simple subroutine
print_newline:
    li    a0, '\n'
    li    a7, 11
    ecall
    ret

end:
    li    a0, 0     # Load the exit code (e.g., 0 for success) into a0
    li    a7, 93    # Load the Exit2 syscall number into a7
    ecall        # Execute the system call to exit
    