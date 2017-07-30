java_library(name = "curator_client",
             exports = ["//external:jar/org/apache/curator/curator_client"],
             visibility = ["//visibility:public"])

java_library(name = "curator_framework",
             exports = ["//external:jar/org/apache/curator/curator_framework"],
             visibility = ["//visibility:public"])

java_library(name = "curator_recipes",
             exports = ["//external:jar/org/apache/curator/curator_recipes"],
             runtime_deps = ["//3rdparty/jvm/org/apache/zookeeper:zookeeper",
                             ":curator_framework"],
             visibility = ["//visibility:public"])
