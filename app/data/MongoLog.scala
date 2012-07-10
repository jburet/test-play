package data

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.global._
import java.util.Date

case class MongoLog(logDate: Date, level: String, serverId: String, txnId: String, message: String)

object MongoLog {
  val logs = MongoConnection()("log-data")("logs")

  //def all = logs.map(grater[MongoLog].asObject(_)).toList
  def all = List(
    MongoLog(new Date(), "ERROR", "Server-1", "123-456-789", "Test log 1"),
    MongoLog(new Date(), "ERROR", "Server-1", "123-456-789", "Test log 2"),
    MongoLog(new Date(), "ERROR", "Server-1", "123-456-789", "Test log 3"),
    MongoLog(new Date(), "ERROR", "Server-1", "123-456-789", "Test log 4")
  )

  def create(registration: MongoLog) {
    logs += grater[MongoLog].asDBObject(registration)
  }
}