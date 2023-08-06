# Using Maven Test

1. Create [HelloWorldTest.java][HelloWorldTest] file.
1. Test a `HelloWorldStringTest` function - `.\mvnw test -Dtest=HelloWorldTest#HelloWorldStringTest`.
1. Test all functions in [HelloWorldTest.java][HelloWorldTest] file. - `.\mvnw test -Dtest=HelloWorldTest`.
1. ***Test all - .\mvnw test***.
1. Using curl - `curl -vv http://127.0.0.1:8080/hello`.
1. Using curl - `curl -vv http://127.0.0.1:8080/hello-json`.
1. Using PowerShell 7.x - `Invoke-WebRequest http://127.0.0.1:8080/hello`.
1. Using PowerShell 7.x - `Invoke-WebRequest http://127.0.0.1:8080/hello-json`.
1. <https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.utility/invoke-webrequest?view=powershell-7.3>

[HelloWorldTest]: /Java/alochym/src/test/java/com/github/alochym/hello/HelloWorldTest.java
