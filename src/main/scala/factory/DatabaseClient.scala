package database.client

import simple.connection._

abstract class DatabaseClient {
  protected def connect(): SimpleConnection

  def executeQuery(query: String): Unit = {
    val connection = connect()
    connection.executeQuery(query)
  }
}

class MysqlClient extends DatabaseClient {
  protected def connect(): SimpleConnection =
    new SimpleMysqlConnection
}

class PgSqlClient extends DatabaseClient {
  protected def connect(): SimpleConnection =
    new SimplePgSqlConnection
}
