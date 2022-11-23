fun main(args: Array<String>) {
    println("12_InnerClasses")

    val mListView = ListView(arrayOf("Name1", "Name2", "Name3"))

    mListView.listItems().displayItems(2)
}

class ListView(val items: Array<String>) {

    inner class listItems() {

        fun displayItems(position: Int) {
            println(items[position])
        }

    }
}