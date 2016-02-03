/**
 * Created by andre on 12/31/14.
 */
object hello {
  def main(args:Array[String]): Unit = {
    val printer = new Printer("Scalatron")
    printer.go
    runner(printPlease)
  }

  def printPlease() = println("Scalatron Printer")

  def runner(runThis: () => Unit): Unit ={
    runThis()
  }
}


class Printer(message: String) {
  def go = println(message)
}