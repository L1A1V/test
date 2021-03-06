import java.util.*

fun main() {

    fun generateArrays(n: Int): Array<Array<Int>?> {
        val set = mutableSetOf<Int>()
        val array = arrayOfNulls<Array<Int>>(n)
        while (set.size != n) {
            set.add((1..n + 10).random())
        }
        val listSet = set.toIntArray()
        for (i in 0 until n) {
            array[i] = Array(listSet[i]) { Random().nextInt() }
        }
        return array
    }

    fun start(n: Int) {
        val arrays = generateArrays(n)
        for (i in 0 until n) {
            arrays[i]!!.sort()
            if (i % 2 != 0)
                arrays[i]!!.reverse()
        }
        //print(arrays.contentDeepToString())
    }
    start(5)
}