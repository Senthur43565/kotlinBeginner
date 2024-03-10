//
//
////create a products inside shoppinMall
////create a class for shoppingCart, in that Cart add fun like it adds and removes item
////fun to display items in cart
////fun to calculate total price
////main()
////create an instance for both the classes
////and add the products to it as an constructor parameter value
//
//class Products(val name: String, val price : Double){
//    fun displayDetails(){
//        println("product name : ${name} and product price : ${price}")
//    }
//}
//class ShoppingCart(){
//    private val items = mutableListOf<Products>()
//    fun addProduct(things: Products){
//        items.add(things)
//    }
//    fun displayCart(){
//        println("Your Cart :")
//        items.forEach { it.displayDetails() }
//    }
//    fun calculateTotal():Double{
//        var Initialtotal = 0.0
//        for (itemPrice in items){
//            Initialtotal += itemPrice.price
//
//        }
//        return Initialtotal
//    }
//}
//fun main(){
//    val items = """
//        Clothing
//        Shoes
//        Electronics
//        Jewelry
//        Books
//        Toys
//        Home Appliances
//        Cosmetics
//        Sports Equipment
//        Furniture
//    """.trimIndent()
//
//        println("Products available:")
//        println(items)
//    val product3 = Products("game", 100.00)
//    val product4 = Products("washer", 1500.00)
//
//    val shoppingcartt = ShoppingCart()
//    shoppingcartt.addProduct(product3)
//    shoppingcartt.addProduct(product4)
//
//    shoppingcartt.displayCart()
//    println("Total cart price : ${shoppingcartt.calculateTotal()}")
//}






























