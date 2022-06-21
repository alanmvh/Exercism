"""Functions used in preparing Guido's gorgeous lasagna.
 
Learn about Guido, the creator of the Python language: https://en.wikipedia.org/wiki/Guido_van_Rossum
"""
# TODO: define the 'EXPECTED_BAKE_TIME' constant
EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2
# TODO: consider defining the 'PREPARATION_TIME' constant
#       equal to the time it takes to prepare a single layer
# TODO: define the 'bake_time_remaining()' function
def bake_time_remaining(min_oven):
    """Calculate the bake time remaining.
    
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.
 
    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - min_oven
    pass
# TODO: define the 'preparation_time_in_minutes()' function
#       and consider using 'PREPARATION_TIME' here
def preparation_time_in_minutes(num_layers):
    """
    Return preparation time in minutes by each layer
 
    This function take one argument representing the number of layers and calculates the time that takes to complete all the layers
    """
    return num_layers * PREPARATION_TIME
    
    
# TODO: define the 'elapsed_time_in_minutes()' function
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """
    Return elapsed coooking time.
 
    This function takes two numbers representing the number of layers and the time already spent
    baking calculates the total elapse minutes spent cooking the lasagna
    
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
    
    