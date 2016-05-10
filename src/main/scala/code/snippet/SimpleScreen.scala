package code
package snippet

import scala.xml._

import net.liftweb._
import common._
import http.{LiftScreen, S}
import http.js._
import http.js.JsCmds._
import http.js.JE.Call
import util.FieldError
import util.Helpers._

class SimpleScreen extends LiftScreen {

  val name = field("Name", "")

  override def defaultToAjax_? : Boolean = true
  override def allTemplate = savedDefaultXml

  override protected def calcAjaxOnDone: JsCmd = {
    Run("console.log('ajax done')")
  }

  val formName = "contactScreen"

  def finish() {
    S.notice("Name: "+name)
  }
}
