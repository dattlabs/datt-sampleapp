package com.datt.sampleapp

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._
import java.net.InetAddress
import spray.httpx.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._

class ServiceActor extends Actor with SampleAppService {
  def actorRefFactory = context
  def receive = runRoute(defaultRoute)
}

trait SampleAppService extends HttpService {
  val defaultRoute =
    path("") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            Map("IP" -> InetAddress.getLocalHost.getHostAddress)
          }
        }
      }
    }
}
