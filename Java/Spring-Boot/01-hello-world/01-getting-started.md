# Hello World REST API

1. Endpoint URI: `/hello`.
1. Request Method: `GET`.
1. Response:
    1. Status code: `200 OK`.
    1. Body: `Hello World REST API`.
1. the application spring boot application [HelloWorld.java](/Java/alochym/src/main/java/com/github/alochym/hello/HelloWorld.java).
1. mvnw spring-boot:test
1. curl localhost:8080/hello
1. Using curl - `curl -vv http://127.0.0.1:8080/hello`.
1. Using curl - `curl -vv http://127.0.0.1:8080/hello-json`.
1. Using PowerShell 7.x - `Invoke-WebRequest http://127.0.0.1:8080/hello`.
1. Using PowerShell 7.x - `Invoke-WebRequest http://127.0.0.1:8080/hello-json`.
1. <https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.utility/invoke-webrequest?view=powershell-7.3>
