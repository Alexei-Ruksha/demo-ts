 echo off
   rem javac -s hello-world hello-world\src\main\java\com\app\HelloWorld.
  rem echo ~dpo=%~dp0
    set PROJECT_PATH=%~dp0
  cd /d %PROJECT_PATH%
  javac -d target\classes src\main\java\com\app\HelloWorld.java
  java -cp target/classes com.app.HelloWorld

