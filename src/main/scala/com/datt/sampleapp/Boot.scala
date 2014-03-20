package com.datt.sampleapp

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http

object Boot {
  // we need an ActorSystem to host our application in
  implicit val system = ActorSystem("sample-app-system")

  // create and start our service actor
  val service = system.actorOf(Props[ServiceActor], "ip-service")

  def main(args: Array[String]): Unit = {
    IO(Http) ! Http.Bind(service, interface = "localhost", port = args.head.toInt)
  }
}

