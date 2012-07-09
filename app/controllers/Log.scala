package controllers

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.global._
import java.util.Date

case class Log(logDate: Date,level:String, message:String)

object Log {
  val logs = MongoConnection()("log-data")("logs")

  def all = logs.map(grater[Log].asObject(_)).toList

  def create(registration: Log) {
    logs += grater[Log].asDBObject(registration)
  }
}