java_library(name = "ST4",
             exports = ["//external:jar/org/antlr/ST4"],
             visibility = ["//visibility:public"])

java_library(name = "antlr4_runtime",
             exports = ["//external:jar/org/antlr/antlr4_runtime"],
             visibility = ["//visibility:public"])

java_library(name = "antlr_runtime",
             exports = ["//external:jar/org/antlr/antlr_runtime"],
             runtime_deps = ["//3rdparty/jvm/antlr:antlr",
                             ":stringtemplate"],
             visibility = ["//visibility:public"])

java_library(name = "stringtemplate",
             exports = ["//external:jar/org/antlr/stringtemplate"],
             visibility = ["//visibility:public"])
