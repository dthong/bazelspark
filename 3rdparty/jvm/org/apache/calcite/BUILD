java_library(name = "calcite_avatica",
             exports = ["//external:jar/org/apache/calcite/calcite_avatica"],
             visibility = ["//visibility:public"])

java_library(name = "calcite_core",
             exports = ["//external:jar/org/apache/calcite/calcite_core"],
             runtime_deps = ["//3rdparty/jvm/net/hydromatic:eigenbase_properties",
                             ":calcite_linq4j"],
             visibility = ["//visibility:public"])

java_library(name = "calcite_linq4j",
             exports = ["//external:jar/org/apache/calcite/calcite_linq4j"],
             visibility = ["//visibility:public"])
