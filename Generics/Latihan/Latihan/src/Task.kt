import kotlin.reflect.typeOf

// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("$stringResult" +
            "$intResult")
}

// TODO 1
fun <T> getResult(item: T): Int {
    if( item is Int) {
        return item *5
    }
    if( item is String){
        return item.length
    }
    return 0
}