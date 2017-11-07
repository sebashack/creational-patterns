package simple.connection


trait SimpleConnection {
  def getName() : String
  def executeQuery(query: String): Unit
}

class SimpleMysqlConnection extends SimpleConnection {
  def getName(): String = "SimpleMysqlconnection"

  def executeQuery(query: String): Unit =
    println(s"Executing the query '$query' the MySQL way")
}

class SimplePgSqlConnection extends SimpleConnection {
  def getName(): String = "SimplePgSqlConnection"

  def executeQuery(query: String): Unit =
    System.out.println(s"Executing the query '$query' the PgSQL way.")
}
