val map = Map("a" -> 1 , "b" -> 2 ,"c" -> 3 , "d" -> 4)
map.filter(_._1 == "b").values.sum

val toppings = List("b","c")
val toppingPrice = map.view.filterKeys(toppings.toSet).toMap.values.sum

val list = List("aaa","bbb","ccc")
val length = list.map(_.length()).reduce(_ + _)