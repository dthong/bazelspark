java_library(name = "scala_compiler",
             exports = ["//external:jar/org/scala_lang/scala_compiler"],
             runtime_deps = ["//3rdparty/jvm/org/scala_lang/modules:scala_parser_combinators_2_11",
                             "//3rdparty/jvm/org/scala_lang/modules:scala_xml_2_11"],
             visibility = ["//visibility:public"])

scala_library(name = "scala_library",
              exports = ["//3rdparty/manual:scala_library_file"],
              visibility = ["//visibility:public"])

scala_library(name = "scala_reflect",
              exports = ["//3rdparty/manual:scala_reflect_file"],
              visibility = ["//visibility:public"])

java_library(name = "scala_xml",
             exports = ["//external:jar/org/scala_lang/scala_xml"],
             visibility = ["//visibility:public"])

java_library(name = "scalap",
             exports = ["//external:jar/org/scala_lang/scalap"],
             runtime_deps = [":scala_compiler"],
             visibility = ["//visibility:public"])
