fun main() {

    var f1 = Fraction(2F, 4F)

    var f2 = Fraction(1F, 2F)
    f1.shekveca()

    println(f1.namravli(f2))
    print(f1.jami(f2))

}

class Fraction(n: Float, d: Float) {

   private var numerator: Float = n
    private var denominator: Float = d

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

   fun shekveca( ) {

        var a = numerator
        var b = denominator
        if (a%2==0F && a%2==0F){
            while(a%2==0F && a%2==0F){
                a /= 2
                b /= 2
            }

        }else
            while (a%3==0F && a%3==0F){
                a /= 3
                b /= 3
            }
        var c : String = "$a/$b"
        println(c)

    }
    fun namravli (fraction:Fraction): Fraction {
        val mr : Float = numerator*fraction.numerator
        val mn : Float = denominator*fraction.denominator
        return Fraction(mr , mn)


}
    fun jami (fraction: Fraction): Fraction {
        if (denominator%fraction.denominator==0F || fraction.denominator%denominator==0F){

            if(denominator>fraction.denominator){
             val   a=denominator/fraction.denominator
            val b = numerator+ a*fraction.numerator
                val c = denominator
                return Fraction(b , c)
            }
            else{
                val   a=fraction.denominator/denominator
                val b = fraction.numerator+ a*numerator
                val c = fraction.denominator
                return Fraction(b , c)


            }

        }
        else{
          val  a=denominator*fraction.denominator
          val  b = a*numerator+a*fraction.numerator
            return Fraction(a , b)

        }


    }

}

