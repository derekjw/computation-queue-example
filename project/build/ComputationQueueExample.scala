import sbt._
import sbt.CompileOrder._

class ComputationQueueExampleProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject
{
  override def compileOptions = Optimize :: Unchecked :: super.compileOptions.toList

  //val specs = "org.scala-tools.testing" %% "specs" % "1.6.5" % "test"
}
