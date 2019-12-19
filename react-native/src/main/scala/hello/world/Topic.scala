package hello.world

import slinky.core._
import slinky.core.annotations.react
import slinky.native._

import typings.reactDashRouterDashNative.ReactRouterNativeFacade._
import typings.reactDashRouter.reactDashRouterMod._

import scala.scalajs.js

@react object Topic {

  @js.native
  trait Param extends js.Object {
    val topicId: String = js.native
  }

  case class Props(`match`: `match`[Topic.Param])

  val component = FunctionalComponent[Props] { props =>
    Text(style = Styles.topicStyle)("Topic: " + props.`match`.params.topicId)
  }
}
