// COMP2850 Portfolio: Week 4
// ToDoList class

// Name: Oliver Cruise
// StudentID: 201823825

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

// class for to do list

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    // computes values

    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted }  // compute no. of items with NotStarted status
    val inProgress get() = items.count { it.status == ItemStatus.InProgress }   // compute no. of items with InProgress status
    val done get() = items.count { it.status == ItemStatus.Done }         // compute no. of items with Done status
    val overdue get() = items.count { it.dueDate < today() && it.status != ItemStatus.Done }    // compute no. of overdue items

    // constructor class (loads  filename)

    constructor(filename: String): this() {
        load(filename)
    }

    // loads contents of file into List

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format

        // loads contents of file and creates ToDoItem object for each line

        Path(filename).forEachLine { line ->
        val parts = line.split(": ", limit = 3)
        val toDoItem = ToDoItem(LocalDate.parse(parts[0]),ItemStatus.valueOf(parts[1]),parts[2])
        items.add(toDoItem)
}

    }

    // saves contents of list to file

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    // adds a new item to the list

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    // deletes all items where ItemStatus is "Done"

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        val original_size = items.size

        for(item in items.toList()){
            if(item.status == ItemStatus.Done){
                items.remove(item)      
            }
        }

        // checks if any items were removed and returns true if so

        val new_size = items.size

        if (new_size < original_size){
            return true
        }else{
            return false
        }
        
    }

    // returns list where ItemStatus is equal to status in parameter

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null

        // creates temporary list with items that fit criteria

        val temp_Items = mutableListOf<ToDoItem>()

        // if status is null, returns list with all items

        if (status == null){
            return items.toList()
        }else{
            for (item in items){
                if (item.status == status){
                    temp_Items.add(item)
                }
            }
            return temp_Items
        }
    }

    // returns all items where date is equal to date is parameter

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date

        // creates temporary list with items that fit criteria

        val temp_Items = mutableListOf<ToDoItem>()

        for (item in items){
            if (item.dueDate == date){
                temp_Items.add(item)
            }
        }
        return temp_Items
    }
}
