package simple.jdbc

import java.sql.Connection
import java.sql.Driver
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.logging.Logger

@Suppress("TooManyFunctions")
class SimpleDriver : Driver {
  init {
    java.sql.DriverManager.registerDriver(this)
  }

  override fun connect(url: String?, info: Properties?): Connection {
    return SimpleConnection(uri = url)
  }

  override fun acceptsURL(url: String?): Boolean {
    TODO("Not yet implemented")
  }

  override fun getPropertyInfo(url: String?, info: Properties?): Array<DriverPropertyInfo> {
    TODO("Not yet implemented")
  }

  override fun getMajorVersion(): Int {
    TODO("Not yet implemented")
  }

  override fun getMinorVersion(): Int {
    TODO("Not yet implemented")
  }

  override fun jdbcCompliant(): Boolean {
    TODO("Not yet implemented")
  }

  override fun getParentLogger(): Logger {
    TODO("Not yet implemented")
  }
}
