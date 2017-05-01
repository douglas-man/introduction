package Chapter1

/**
  * Created by douglas.man on 5/1/2017.
  */
object Introduction extends App {

  def isPalindrome(word: String) = {
    val modifiedWord = word.toLowerCase.replaceAll("[^a-z0-9]", "")
    val reversed = modifiedWord.reverse
    modifiedWord == reversed
  }

  println("Is 'Herculaneum' a palidrome? " + isPalindrome("Herculaneum") )

}
