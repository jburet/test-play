package controllers

import _root_.data.MongoLog
import play.api._
import play.api.mvc._

object Application extends Controller {

  def home = Action { implicit request =>
    Ok(views.html.home())
  }

  def query = Action { implicit request =>
    Ok(views.html.query(MongoLog.all))
  }

  def view = Action { implicit request =>
    Ok(views.html.view())
  }

  def monitoring = Action { implicit request =>
    Ok(views.html.monitoring())
  }
  
}