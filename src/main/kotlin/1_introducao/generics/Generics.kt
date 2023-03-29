package generics

class MultableStack<E>(vararg items : E){
    private val elements = items.toMutableList()

    fun push(element : E) = elements.add(element)

    fun peek() : E = elements.last()

    fun pop() = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MultableStack(${elements.joinToString()})"
}

fun main(){

    val stack = MultableStack(0.4, 2.57, "Sei la", 10, true)
    stack.push("Aron")
    print(stack)

    println("peek() = ${stack.peek()}")

    for(i in 1..stack.size()){
        println("pop() = ${stack.pop()}")
        println(stack)
    }

}