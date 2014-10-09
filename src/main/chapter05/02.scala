/**
 * Created by Prescott on 10/9/14.
 */
class BankAccount(var balance: Double) {
  def deposit(amount: Double) = { balance += amount }
  def withdraw(amount: Double) = {
    if (balance >= amount) balance -= amount
    else throw new Exception(s"Cannot withdraw $amount. Account balance: $balance")
  }
}

val acct = new BankAccount(100)
println(acct.balance)
acct.withdraw(50)
println(acct.balance)
acct.deposit(100)
println(acct.balance)

try {
  acct.withdraw(1000)
} catch {
  case e: Exception => println(e.getMessage)
}
