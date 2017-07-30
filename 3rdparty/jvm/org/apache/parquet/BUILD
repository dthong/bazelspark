java_library(name = "parquet_column",
             exports = ["//external:jar/org/apache/parquet/parquet_column"],
             runtime_deps = [":parquet_common",
                             ":parquet_encoding"],
             visibility = ["//visibility:public"])

java_library(name = "parquet_common",
             exports = ["//external:jar/org/apache/parquet/parquet_common"],
             visibility = ["//visibility:public"])

java_library(name = "parquet_encoding",
             exports = ["//external:jar/org/apache/parquet/parquet_encoding"],
             visibility = ["//visibility:public"])

java_library(name = "parquet_format",
             exports = ["//external:jar/org/apache/parquet/parquet_format"],
             visibility = ["//visibility:public"])

java_library(name = "parquet_hadoop",
             exports = ["//external:jar/org/apache/parquet/parquet_hadoop"],
             runtime_deps = ["//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
                             "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
                             ":parquet_format",
                             ":parquet_jackson"],
             visibility = ["//visibility:public"])

java_library(name = "parquet_jackson",
             exports = ["//external:jar/org/apache/parquet/parquet_jackson"],
             visibility = ["//visibility:public"])
