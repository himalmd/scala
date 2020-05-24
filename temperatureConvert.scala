object TemperatureConverter { 
      
   def main(args: Array[String]) { 
         
      // Calling the function 
      println("F is: " + celciusToFahrenheit(35.00)); 
   } 
     
     
   // declaration and definition of function 
   def celciusToFahrenheit(c:Double) : Double = 
   { 
         
       var f:Double = 0.0
       f = c*1.8 + 32.00 
  
       // returning the value of Fahrenheit
       return f 
   } 
}