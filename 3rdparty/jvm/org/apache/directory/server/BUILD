java_library(name = "apacheds_i18n",
             exports = ["//external:jar/org/apache/directory/server/apacheds_i18n"],
             visibility = ["//visibility:public"])

java_library(name = "apacheds_kerberos_codec",
             exports = ["//external:jar/org/apache/directory/server/apacheds_kerberos_codec"],
             runtime_deps = ["//3rdparty/jvm/org/apache/directory/api:api_asn1_api",
                             "//3rdparty/jvm/org/apache/directory/api:api_util",
                             ":apacheds_i18n"],
             visibility = ["//visibility:public"])
