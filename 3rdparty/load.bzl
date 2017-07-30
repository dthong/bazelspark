def declare_maven(item):
  sha = item.get("sha1")
  if sha != None:
    server = item.get("server")
    if server != None:
      native.maven_jar(name = item["name"], artifact = item["artifact"], sha1 = sha, server = server)
    else:
      native.maven_jar(name = item["name"], artifact = item["artifact"], sha1 = sha)
  else:
    native.maven_jar(name = item["name"], artifact = item["artifact"])
  native.bind(name = item["bind"], actual = item["actual"])
