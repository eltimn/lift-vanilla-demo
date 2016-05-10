package code
package snippet

import scala.xml._

import net.liftweb._
import common._
import http.{LiftScreen, S, SHtml}
import http.js._
import http.js.JsCmds._
import http.js.JE.Call
import util.FieldError
import util.Helpers._

class SimpleSnippet {

  def render = {
    var name = ""

    def save(): JsCmd = {
      S.notice("Name: "+name)
      Run(s"console.log('name: $name')")
    }

    "name=name" #> SHtml.text(name, name = _) &
    "#submit-btn" #> SHtml.ajaxOnSubmit(save _ )
  }
}
