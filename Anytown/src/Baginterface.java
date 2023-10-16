public interface Baginterface {
    public int getCurrentSize();
    /*
     * the number of elements currently contained in the bag
     * 
     * @return - (int) number of elements
     */

    public boolean isEmpty();
    /*
     * test for an empty bag
     * 
     * @return - (boolean) true if the number of elements is zero, false otherwise
     */

    public boolean addNewEntry(Building newEntry);
    /*
     * test for spare capacity in the bag and if it exists, add the new element
     * and increment the number of elements in the bag
     * 
     * @param (Building) newEntry - the item to be added to the bag
     * 
     * @return - (boolean) true if the item is added, false otherwise
     */

    public Building remove();
    /*
     * remove the specified element from the bag, if it is present, and decrement
     * the number of elements. Return the remove element or null if none is
     * available
     * 
     * @return - (Building) the element removed from the bag, or null
     */

    public boolean remove(Building anEntry);
    /*
     * remove the specified element from the bag, if it is present and decrement
     * the number of elements
     * 
     * @return - (boolean) true if the element is available, false otherwise
     */

    public void clear();
    /*
     * empty the bag - set the number of elements to zero
     */

    public int getFrequencyOf(Building anEntry);
    /*
     * count how many times a given element appears in the bag
     * 
     * @param (Building) anEntry - the element to look for in the bag
     * 
     * @return - (int) the number of times that the given element appears
     */

    public boolean contains(Building anEntry);
    /*
     * check for the presence of a specified element in the bag
     * 
     * @param (Building) anEntry - the item to look for in the bag
     * 
     * @return - (boolean) true if the bag contains the element, false otherwise
     */

    public String toString();
    /*
     * describe all elements in the bag
     * 
     * @return - (String) a string representation of all bag contents
     */

}
