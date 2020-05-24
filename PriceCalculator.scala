
object PriceCalculator{ 
      
   def main(args: Array[String]) { 
         
      // Calling the function 
      println("The total price is: " + totalPrice(60)); 
   } 
     
    
  def discountedPrice() : Double = 
  {
    var price:Double = 24.95
    var discountAmount:Double = 0.4
    var discount:Double = 0.0;
    
    discount = price * discountAmount
    
    return discount
  }
  
  def totalPrice(books:Int) : Double =
  {
    
    var tot:Double = 0.0
    var books1:Double = books.asInstanceOf[Double];
    
    if(books <= 50 ){
      tot = (books1 * 3.00) + (books1 * discountedPrice())
      
    }else{
      tot = 150 + ((books-50) * 0.75) + (books1 * discountedPrice())
    }
    
    return tot;
  }
  

}