java_library(name = "jackson_module_paranamer",
             exports = ["//external:jar/com/fasterxml/jackson/module/jackson_module_paranamer"],
             visibility = ["//visibility:public"])

scala_library(name = "jackson_module_scala",
              exports = ["//external:jar/com/fasterxml/jackson/module/jackson_module_scala_2_11"],
              runtime_deps = ["//3rdparty/jvm/org/scala_lang:scala_reflect",
                              ":jackson_module_paranamer"],
              visibility = ["//visibility:public"])
