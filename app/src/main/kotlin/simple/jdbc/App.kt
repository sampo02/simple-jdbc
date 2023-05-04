package simple.jdbc

import java.sql.DriverManager

fun main() {
  val url = "jdbc:simple://localhost:80/testdb"

  Class.forName("simple.jdbc.SimpleDriver").newInstance()
  DriverManager.getConnection(url).use { con ->
    con.createStatement().use { st ->
      st.execute("INSERT DUMMY SQL")
      st.executeQuery("SELECT DUMMY SQL")
    }
  }
}
