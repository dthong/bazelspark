java_library(name = "hadoop_annotations",
             exports = ["//external:jar/org/apache/hadoop/hadoop_annotations"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_auth",
             exports = ["//external:jar/org/apache/hadoop/hadoop_auth"],
             runtime_deps = ["//3rdparty/jvm/org/apache/directory/server:apacheds_kerberos_codec"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_client",
             exports = ["//external:jar/org/apache/hadoop/hadoop_client"],
             runtime_deps = [":hadoop_annotations",
                             ":hadoop_common",
                             ":hadoop_hdfs",
                             ":hadoop_mapreduce_client_app",
                             ":hadoop_mapreduce_client_core",
                             ":hadoop_mapreduce_client_jobclient",
                             ":hadoop_yarn_api"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_common",
             exports = ["//external:jar/org/apache/hadoop/hadoop_common"],
             runtime_deps = ["//3rdparty/jvm/com/google/code/gson:gson",
                             "//3rdparty/jvm/com/google/protobuf:protobuf_java",
                             "//3rdparty/jvm/commons_cli:commons_cli",
                             "//3rdparty/jvm/commons_collections:commons_collections",
                             "//3rdparty/jvm/commons_configuration:commons_configuration",
                             "//3rdparty/jvm/commons_httpclient:commons_httpclient",
                             "//3rdparty/jvm/commons_io:commons_io",
                             "//3rdparty/jvm/commons_lang:commons_lang",
                             "//3rdparty/jvm/org/apache/curator:curator_client",
                             "//3rdparty/jvm/org/htrace:htrace_core",
                             "//3rdparty/jvm/xmlenc:xmlenc",
                             ":hadoop_auth"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_hdfs",
             exports = ["//external:jar/org/apache/hadoop/hadoop_hdfs"],
             runtime_deps = ["//3rdparty/jvm/org/mortbay/jetty:jetty_util",
                             "//3rdparty/jvm/xerces:xercesImpl"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_mapreduce_client_app",
             exports = ["//external:jar/org/apache/hadoop/hadoop_mapreduce_client_app"],
             runtime_deps = [":hadoop_mapreduce_client_common",
                             ":hadoop_mapreduce_client_shuffle"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_mapreduce_client_common",
             exports = ["//external:jar/org/apache/hadoop/hadoop_mapreduce_client_common"],
             runtime_deps = [":hadoop_yarn_client",
                             ":hadoop_yarn_server_common"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_mapreduce_client_core",
             exports = ["//external:jar/org/apache/hadoop/hadoop_mapreduce_client_core"],
             runtime_deps = [":hadoop_yarn_common"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_mapreduce_client_jobclient",
             exports = ["//external:jar/org/apache/hadoop/hadoop_mapreduce_client_jobclient"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_mapreduce_client_shuffle",
             exports = ["//external:jar/org/apache/hadoop/hadoop_mapreduce_client_shuffle"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_yarn_api",
             exports = ["//external:jar/org/apache/hadoop/hadoop_yarn_api"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_yarn_client",
             exports = ["//external:jar/org/apache/hadoop/hadoop_yarn_client"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_yarn_common",
             exports = ["//external:jar/org/apache/hadoop/hadoop_yarn_common"],
             runtime_deps = ["//3rdparty/jvm/javax/xml/bind:jaxb_api",
                             "//3rdparty/jvm/org/codehaus/jackson:jackson_jaxrs",
                             "//3rdparty/jvm/org/codehaus/jackson:jackson_xc"],
             visibility = ["//visibility:public"])

java_library(name = "hadoop_yarn_server_common",
             exports = ["//external:jar/org/apache/hadoop/hadoop_yarn_server_common"],
             visibility = ["//visibility:public"])
