package com.datt.sampleapp

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http

object Boot {
  implicit val system = ActorSystem("sample-app-system")

  val service = system.actorOf(Props[ServiceActor], "ip-service")

  def main(args: Array[String]): Unit = {
    IO(Http) ! Http.Bind(service, interface = "localhost", port = args.head.toInt)
  }
}

