package pizza

import scala.collection.mutable.ArrayBuffer

object MainDriver extends App {

    val p1 = new Pizza (
        MediumCrustSize,
        ThinCrustType,
        List(Cheese)
    )

    val price = p1.getPrice(toppingsPrices = PriceList.toppingPrice , crustSizePrices = PriceList.crustSizePrice ,
     crustTypePrices = PriceList.crustTypePrice )

     println(s"Pizza1 Price is -> $price")

    val p2 = new Pizza (
        LargeCrustSize,
        ThinCrustType,
        List(Cheese, Pepperoni, Sausage)
    )

    val price2 = p2.getPrice(toppingsPrices = PriceList.toppingPrice , crustSizePrices = PriceList.crustSizePrice ,
     crustTypePrices = PriceList.crustTypePrice )

     println(s"Pizza2 Price is -> $price2")


    val address = Address (
        "123 Main Street",
        "Apt. 1",
        "Talkeetna",
        "Alaska",
        "99676"
    )

    val customer = Customer (
        "Alvin Alexander",
        "907-555-1212",
        address
    )

    val o = new Order(
        List(p1 , p2),
        customer
    )

    val basePrice = o.getBasePrice()
    println(s"Base price is $basePrice")



    // o.addPizza(
    //     new Pizza (
    //         SmallCrustSize,
    //         ThinCrustType,
    //         ArrayBuffer(Cheese, Mushrooms)
    //     )
    // )

    // print the order
    o.printOrder()

    val totalPrice = o.getTotalPrice()
    println(s"Total price is $totalPrice")

}



