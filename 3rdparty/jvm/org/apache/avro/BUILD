java_library(name = "avro",
             exports = ["//external:jar/org/apache/avro/avro"],
             runtime_deps = ["//3rdparty/jvm/com/thoughtworks/paranamer:paranamer",
                             "//3rdparty/jvm/org/apache/commons:commons_compress",
                             "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
                             "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl"],
             visibility = ["//visibility:public"])

java_library(name = "avro_ipc",
             exports = ["//external:jar/org/apache/avro/avro_ipc"],
             visibility = ["//visibility:public"])

java_library(name = "avro_mapred",
             exports = ["//external:jar/org/apache/avro/avro_mapred"],
             runtime_deps = [":avro_ipc"],
             visibility = ["//visibility:public"])
