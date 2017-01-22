  echo off
  rem echo ~dpo=%~dp0
  set PROJECT_PATH=%~dp0
  cd /d %PROJECT_PATH%
   set SOURCE_PATH=src\main\java
    rd target /s
    mkdir target\classes
  javac -d target/classes %SOURCE_PATH%\ts\house\*.java %SOURCE_PATH%\ts\human\*.java %SOURCE_PATH%\ts\outside\*.java
  rem java -cp target/classes ts.house.* ts.human.* ts.outside.*
  cd target\classes
  jar cf ts.jar ts