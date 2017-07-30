package(default_visibility = ["//visibility:public"])

filegroup(
    name = "spark_group",
    srcs = [
        "//3rdparty/manual:scala_library_file",
        "//3rdparty/manual:scala_reflect_file",
        "//external:jar/com/fasterxml/jackson/module/jackson_module_scala_2_11",
        "//external:jar/org/apache/spark/spark_catalyst_2_11",
        "//external:jar/org/apache/spark/spark_core_2_11",
        "//external:jar/org/apache/spark/spark_graphx_2_11",
        "//external:jar/org/apache/spark/spark_hive_2_11",
        "//external:jar/org/apache/spark/spark_launcher_2_11",
        "//external:jar/org/apache/spark/spark_mllib_2_11",
        "//external:jar/org/apache/spark/spark_mllib_local_2_11",
        "//external:jar/org/apache/spark/spark_network_common_2_11",
        "//external:jar/org/apache/spark/spark_network_shuffle_2_11",
        "//external:jar/org/apache/spark/spark_sql_2_11",
        "//external:jar/org/apache/spark/spark_tags_2_11",
        "//external:jar/org/scalanlp/breeze_2_11",
    ],
)

java_import(
    name = "spark_jar",
    jars = [
        ":spark_group",
    ],
    neverlink = 1,
)

scala_library(
    name = "common_jar",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
    deps = [
        "//external:jar/com/beust/jcommander",
        "//external:jar/org/jblas/jblas",
        ":spark_jar",
    ],
)

java_import(
    name = "scala_app_import",
    jars = [
        ":common_jar",
    ],
)

java_binary(
    name = "hello",
    srcs = [],
    main_class = "walletregression.Hello",
    visibility = ["//visibility:public"],
    runtime_deps = [
        ":scala_app_import",
        "//external:jar/com/beust/jcommander",
    ],
)
