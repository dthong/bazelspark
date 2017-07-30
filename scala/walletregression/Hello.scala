package walletregression

// Test import
import com.beust.jcommander.Parameter
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
object Hello {
  private object Param {
    @Parameter(names=Array("--test_param"), description = "Test of using param from jcommander")
    var input = null: String
  }
  def main(args: Array[String]): Unit = {
    val sessionBuilder = SparkSession.builder()
        .appName("Hello")
        .config("spark.hadoop.validateOutputSpecs", "false")
        .config("spark.sql.orc.filterPushdown", "true")
        .master("local[*]")
    val spark = sessionBuilder.getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    println("Hello")
  }
}
