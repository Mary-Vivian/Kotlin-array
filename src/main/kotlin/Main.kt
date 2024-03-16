fun main(args: Array<String>) {
    var animals= arrayOf("Dog","cat","parrot","hen","cow")
//     animals.forEach { animal ->
//       println(animal)
//   }
//    for (x in animals){
//        println(x)
//    }
//    animals=animals.sortedArrayDescending()
//    println(animals.contentToString())
   println( animals.slice(1..4))

//    println(animals[4])
//   println(animals[3])
//    var kanini= arrayOf("Mary",22,3,2,"Mombasa",false)
//    println(kanini.contentToString())
//
//    println(animals.get(3))
//    animals[1]=null
//    animals[2]=null
//    println(animals.contentToString())
////    animals.set(2,"goat")
//    animals[2]="goat"
//    animals[4]="sheep"
//    println(animals.contentToString())
//    var x:Int?=5
//    x=null
//   animals = animals.plus("horse")
//    animals = animals.plus(arrayOf("rat","monkey","squirell"))
//    println(animals.contentToString())
    println(animals.indexOf("hen"))
    var statistics= arrayOf(23,587,43,213,56,6,7788,4,332)
    statistics.forEach {y->
        println(y*y)

    }
    for(b in statistics){
        println(b*b)
    }
    println(statistics.sum())
    println(statistics.minOrNull())
    println(statistics.maxOrNull())
    println(statistics.sum()/statistics.size.toDouble())
    println(statistics.average())
    statistics = statistics.sortedArray()
//    println(statistics.contentToString())
    statistics = statistics.sortedArrayDescending()
    println(statistics.contentToString())


}