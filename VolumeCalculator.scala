import scala.math.pow

object VolumeCalculator { 
      
   def main(args: Array[String]) { 
         
      // Calling the function 
      println("Volume is: " + volumeSphere(5)); 
   } 

   // declaration and definition of function 
   def volumeSphere(r:Double) : Double = 
   { 
         
       var v:Double = 0.0
       var pi:Double = 3.14
       v = 4.0/3.0 * 3.14 * pow(r,3)
  
       // returning the volume
       return v 
   } 
}