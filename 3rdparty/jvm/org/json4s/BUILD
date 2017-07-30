java_library(name = "json4s_ast_2_11",
             exports = ["//external:jar/org/json4s/json4s_ast_2_11"],
             visibility = ["//visibility:public"])

java_library(name = "json4s_core_2_11",
             exports = ["//external:jar/org/json4s/json4s_core_2_11"],
             runtime_deps = ["//3rdparty/jvm/org/scala_lang:scalap",
                             ":json4s_ast_2_11"],
             visibility = ["//visibility:public"])

java_library(name = "json4s_jackson_2_11",
             exports = ["//external:jar/org/json4s/json4s_jackson_2_11"],
             runtime_deps = [":json4s_core_2_11"],
             visibility = ["//visibility:public"])
