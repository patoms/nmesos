addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.8.0")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.3")

resolvers += Resolver.jcenterRepo
addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.19.0")
