scala_library(name = "breeze",
              exports = ["//external:jar/org/scalanlp/breeze_2_11"],
              runtime_deps = ["//3rdparty/jvm/com/chuusai:shapeless_2_11",
                              "//3rdparty/jvm/com/github/fommil/netlib:core",
                              "//3rdparty/jvm/com/github/rwl:jtransforms",
                              "//3rdparty/jvm/net/sf/opencsv:opencsv",
                              "//3rdparty/jvm/net/sourceforge/f2j:arpack_combined_all",
                              "//3rdparty/jvm/org/scala_lang:scala_library",
                              "//3rdparty/jvm/org/slf4j:slf4j_api",
                              "//3rdparty/jvm/org/spire_math:spire_2_11",
                              ":breeze_macros"],
              visibility = ["//visibility:public"])

scala_library(name = "breeze_macros",
              exports = ["//external:jar/org/scalanlp/breeze_macros_2_11"],
              runtime_deps = ["//3rdparty/jvm/org/scala_lang:scala_reflect"],
              visibility = ["//visibility:public"])
