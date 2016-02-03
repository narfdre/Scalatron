package scalatron

import javax.ws.rs.{GET, Path}

import com.sun.jersey.spi.container.servlet.ServletContainer
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.nio.SelectChannelConnector
import org.eclipse.jetty.servlet.{ServletContextHandler, ServletHolder}

/**
 * Created by andre on 1/1/15.
 */
object test {
  def main (args: Array[String]) {
    val server = new Server(8080)
    val connector = new SelectChannelConnector()
    server.addConnector(connector)

    val holder:ServletHolder = new ServletHolder(classOf[ServletContainer])
    holder.setInitParameter(
      "com.sun.jersey.config.property.resourceConfigClass",
      "com.sun.jersey.api.core.PackagesResourceConfig")
    holder.setInitParameter("com.sun.jersey.config.property.packages",
      "scalatron")
    val context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)
    context.addServlet(holder, "/*")
    server.start
    server.join
  }
}

@Path("/")
class TestResource {
  @GET
  def hello() = {
    "HELLO!!"
  }
}
