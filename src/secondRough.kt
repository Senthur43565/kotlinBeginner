class Products(val name: String, val price : Double){
    fun displayDetails(){
        println("product name : ${name} and product price : ${price}")
    }
}
class ShoppingCart(){
    private val items = mutableListOf<Products>()
    fun addProduct(things: Products){
        items.add(things)
    }
    fun displayCart(){
        println("Your Cart :")
        items.forEach { it.displayDetails() }
    }
    fun calculateTotal():Double{
        var Initialtotal = 0.0
        for (all in items){
            Initialtotal += all.price

        }
        return Initialtotal
    }
}
fun main(){
    val product3 = Products("laptop", 10000.00)
    val product4 = Products("washer", 1500.00)

    val shoppingcartt = ShoppingCart()
    shoppingcartt.addProduct(product3)
    shoppingcartt.addProduct(product4)

    shoppingcartt.displayCart()
    println("Total cart price : ${shoppingcartt.calculateTotal()}")
}