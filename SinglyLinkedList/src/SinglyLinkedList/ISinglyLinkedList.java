package SinglyLinkedList;

public interface ISinglyLinkedList {
    /* Problem
    Develop a desktop application on Windows or Linux that implements a singly
    linked list of integers (user-entered) and returns the value of the Mth (user-entered)
    element from the end of the list such that when M = 0 the last element of the list is
    returned. Make sure you devise a time- and space-efficient algorithm that only uses the head
    of the list and M as input where the length of the list is unknown and take care to handle
    relevant error conditions.
    Note:
    You are not allowed to use the perks of the language you use such as predefined (linked list)
    data structures or algorithms.
    Example:
        1 -> 3 -> 2 -> 5 and M = 0 must return the value of 5 (the value of the last element).
        1 -> 3 -> 2 -> 5 and M = 1 must return the value of 2 (the value of the element before the last).
     */

    /* Solution
    Because all that was asked from me was to add new elements to the list and get an element with an index,
    I didn't bother creating the other methods the linked list has.
     */

    void add(int index);
    void get(int index);

}
