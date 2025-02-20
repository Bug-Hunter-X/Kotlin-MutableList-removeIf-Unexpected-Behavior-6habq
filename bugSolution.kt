fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) //Correct output [1, 3, 5]

    //Solution 2: Creating a new list
    val newList = list.filter { it % 2 != 0 }
    println(newList) //Correct output [1, 3, 5] 
}