package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class UserEntitlementsController @Inject()(
  val controllerComponents: ControllerComponents
) extends BaseController {

  def someMethod(Argument1: Int, Argument2: Int): Action[AnyContent] = {
    Action(Ok("hello"))
  }
}
